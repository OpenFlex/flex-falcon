/*
 *
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.apache.flex.swc.io;

import org.apache.flex.swf.Header;
import org.apache.flex.swf.ISWF;
import org.apache.flex.swf.io.ISWFWriter;

/**
 * A factory interface for creating {@link ISWFWriter}.
 */
public interface ISWFWriterFactory
{

    ISWFWriter createSWFWriter(ISWF swf, Header.Compression useCompression, boolean enableDebug);
}
