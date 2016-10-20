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
package com.aliyuncs.green.transform.v20161018;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.green.model.v20161018.TextAntispamDetectionResponse;
import com.aliyuncs.green.model.v20161018.TextAntispamDetectionResponse.TextAntispamResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class TextAntispamDetectionResponseUnmarshaller {

	public static TextAntispamDetectionResponse unmarshall(TextAntispamDetectionResponse textAntispamDetectionResponse, UnmarshallerContext context) {
		
		textAntispamDetectionResponse.setCode(context.stringValue("TextAntispamDetectionResponse.Code"));
		textAntispamDetectionResponse.setMsg(context.stringValue("TextAntispamDetectionResponse.Msg"));

		List<TextAntispamResult> textAntispamResults = new ArrayList<TextAntispamResult>();
		for (int i = 0; i < context.lengthValue("TextAntispamDetectionResponse.TextAntispamResults.Length"); i++) {
			TextAntispamResult textAntispamResult = new TextAntispamResult();
			textAntispamResult.setText(context.stringValue("TextAntispamDetectionResponse.TextAntispamResults["+ i +"].Text"));
			textAntispamResult.setIsSpam(context.booleanValue("TextAntispamDetectionResponse.TextAntispamResults["+ i +"].IsSpam"));

			textAntispamResults.add(textAntispamResult);
		}
		textAntispamDetectionResponse.setTextAntispamResults(textAntispamResults);
	 
	 	return textAntispamDetectionResponse;
	}
}