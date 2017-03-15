/*
 *
 *   Copyright 2003 the original author or authors.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 */
package org.powermock.api.mockito.repackaged.cglib.core;

import org.powermock.api.mockito.repackaged.asm.ClassWriter;

public class DefaultGeneratorStrategy implements GeneratorStrategy {
    public static final DefaultGeneratorStrategy INSTANCE = new DefaultGeneratorStrategy();
    
    public byte[] generate(ClassGenerator cg) throws Exception {
        ClassWriter cw = getClassWriter();
        transform(cg).generateClass(cw);
        return transform(cw.toByteArray());
    }

    protected ClassWriter getClassWriter() throws Exception {
      return new DebuggingClassWriter(ClassWriter.COMPUTE_MAXS);
    }

    protected byte[] transform(byte[] b) throws Exception {
        return b;
    }

    protected ClassGenerator transform(ClassGenerator cg) throws Exception {
        return cg;
    }
}