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
package com.aliyuncs.green.transform.v20161115;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.green.model.v20161115.PluginAntispamResultsResponse;
import com.aliyuncs.green.model.v20161115.PluginAntispamResultsResponse.AntispamResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class PluginAntispamResultsResponseUnmarshaller {

	public static PluginAntispamResultsResponse unmarshall(PluginAntispamResultsResponse pluginAntispamResultsResponse, UnmarshallerContext context) {
		
		pluginAntispamResultsResponse.setCode(context.stringValue("PluginAntispamResultsResponse.Code"));
		pluginAntispamResultsResponse.setMsg(context.stringValue("PluginAntispamResultsResponse.Msg"));
		pluginAntispamResultsResponse.setTotalCount(context.integerValue("PluginAntispamResultsResponse.TotalCount"));
		pluginAntispamResultsResponse.setPageIndex(context.integerValue("PluginAntispamResultsResponse.PageIndex"));
		pluginAntispamResultsResponse.setPageSize(context.stringValue("PluginAntispamResultsResponse.PageSize"));

		List<AntispamResult> antispamResults = new ArrayList<AntispamResult>();
		for (int i = 0; i < context.lengthValue("PluginAntispamResultsResponse.AntispamResults.Length"); i++) {
			AntispamResult antispamResult = new AntispamResult();
			antispamResult.setId(context.stringValue("PluginAntispamResultsResponse.AntispamResults["+ i +"].Id"));
			antispamResult.setUserId(context.stringValue("PluginAntispamResultsResponse.AntispamResults["+ i +"].UserId"));
			antispamResult.setTopicId(context.stringValue("PluginAntispamResultsResponse.AntispamResults["+ i +"].TopicId"));
			antispamResult.setTitle(context.stringValue("PluginAntispamResultsResponse.AntispamResults["+ i +"].Title"));
			antispamResult.setFeedId(context.stringValue("PluginAntispamResultsResponse.AntispamResults["+ i +"].FeedId"));
			antispamResult.setContent(context.stringValue("PluginAntispamResultsResponse.AntispamResults["+ i +"].Content"));
			antispamResult.setContentType(context.stringValue("PluginAntispamResultsResponse.AntispamResults["+ i +"].ContentType"));
			antispamResult.setIsIllegal(context.booleanValue("PluginAntispamResultsResponse.AntispamResults["+ i +"].IsIllegal"));
			antispamResult.setIllegalReason(context.stringValue("PluginAntispamResultsResponse.AntispamResults["+ i +"].IllegalReason"));
			antispamResult.setBizSence(context.stringValue("PluginAntispamResultsResponse.AntispamResults["+ i +"].BizSence"));
			antispamResult.setDynamicProp(context.stringValue("PluginAntispamResultsResponse.AntispamResults["+ i +"].DynamicProp"));

			antispamResults.add(antispamResult);
		}
		pluginAntispamResultsResponse.setAntispamResults(antispamResults);
	 
	 	return pluginAntispamResultsResponse;
	}
}