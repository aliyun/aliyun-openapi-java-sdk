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
package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.ListCoverPipelineResponse;
import com.aliyuncs.mts.model.v20140618.ListCoverPipelineResponse.Pipeline;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCoverPipelineResponseUnmarshaller {

	public static ListCoverPipelineResponse unmarshall(ListCoverPipelineResponse listCoverPipelineResponse, UnmarshallerContext context) {
		
		listCoverPipelineResponse.setRequestId(context.stringValue("ListCoverPipelineResponse.RequestId"));
		listCoverPipelineResponse.setTotalCount(context.longValue("ListCoverPipelineResponse.TotalCount"));
		listCoverPipelineResponse.setPageNumber(context.longValue("ListCoverPipelineResponse.PageNumber"));
		listCoverPipelineResponse.setPageSize(context.longValue("ListCoverPipelineResponse.PageSize"));

		List<Pipeline> pipelineList = new ArrayList<Pipeline>();
		for (int i = 0; i < context.lengthValue("ListCoverPipelineResponse.PipelineList.Length"); i++) {
			Pipeline pipeline = new Pipeline();
			pipeline.setUserId(context.longValue("ListCoverPipelineResponse.PipelineList["+ i +"].UserId"));
			pipeline.setPipelineId(context.stringValue("ListCoverPipelineResponse.PipelineList["+ i +"].PipelineId"));
			pipeline.setName(context.stringValue("ListCoverPipelineResponse.PipelineList["+ i +"].Name"));
			pipeline.setState(context.stringValue("ListCoverPipelineResponse.PipelineList["+ i +"].State"));
			pipeline.setPriority(context.stringValue("ListCoverPipelineResponse.PipelineList["+ i +"].Priority"));
			pipeline.setQuotaNum(context.integerValue("ListCoverPipelineResponse.PipelineList["+ i +"].quotaNum"));
			pipeline.setQuotaUsed(context.integerValue("ListCoverPipelineResponse.PipelineList["+ i +"].quotaUsed"));
			pipeline.setNotifyConfig(context.stringValue("ListCoverPipelineResponse.PipelineList["+ i +"].NotifyConfig"));
			pipeline.setRole(context.stringValue("ListCoverPipelineResponse.PipelineList["+ i +"].Role"));
			pipeline.setExtendConfig(context.stringValue("ListCoverPipelineResponse.PipelineList["+ i +"].ExtendConfig"));

			pipelineList.add(pipeline);
		}
		listCoverPipelineResponse.setPipelineList(pipelineList);
	 
	 	return listCoverPipelineResponse;
	}
}