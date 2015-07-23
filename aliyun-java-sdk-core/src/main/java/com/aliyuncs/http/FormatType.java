/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.http;

public enum FormatType {
	XML,
	JSON,
	RAW;
	
	public static String mapFormatToAccept(FormatType format) {
		if (FormatType.XML == format)
			return "application/xml";
		if (FormatType.JSON == format)
			return "application/json";
		
		return "application/octet-stream";
	}
	
	public static FormatType mapAcceptToFormat(String accept) {
		if (accept.toLowerCase().equals("application/xml") ||
				accept.toLowerCase().equals("text/xml"))
			return FormatType.XML;
		if (accept.toLowerCase().equals("application/json"))
			return FormatType.JSON;
		
		return FormatType.RAW;
	}
}
