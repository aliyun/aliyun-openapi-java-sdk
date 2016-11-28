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
package com.aliyuncs.green.transform.v20161124;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.green.model.v20161124.TextKeywordFilterResponse;
import com.aliyuncs.green.model.v20161124.TextKeywordFilterResponse.KeywordResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class TextKeywordFilterResponseUnmarshaller {

	public static TextKeywordFilterResponse unmarshall(TextKeywordFilterResponse textKeywordFilterResponse, UnmarshallerContext context) {
		
		textKeywordFilterResponse.setCode(context.stringValue("TextKeywordFilterResponse.Code"));
		textKeywordFilterResponse.setMsg(context.stringValue("TextKeywordFilterResponse.Msg"));
		textKeywordFilterResponse.setHit(context.booleanValue("TextKeywordFilterResponse.Hit"));
		textKeywordFilterResponse.setTaskId(context.stringValue("TextKeywordFilterResponse.TaskId"));

		List<KeywordResult> keywordResults = new ArrayList<KeywordResult>();
		for (int i = 0; i < context.lengthValue("TextKeywordFilterResponse.KeywordResults.Length"); i++) {
			KeywordResult keywordResult = new KeywordResult();
			keywordResult.setKeywordCtx(context.stringValue("TextKeywordFilterResponse.KeywordResults["+ i +"].KeywordCtx"));
			keywordResult.setKeywordType(context.stringValue("TextKeywordFilterResponse.KeywordResults["+ i +"].KeywordType"));

			keywordResults.add(keywordResult);
		}
		textKeywordFilterResponse.setKeywordResults(keywordResults);
	 
	 	return textKeywordFilterResponse;
	}
}