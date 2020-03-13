/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.QueryMsSgServicePublishersResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMsSgServicePublishersResponse.PublishersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMsSgServicePublishersResponseUnmarshaller {

	public static QueryMsSgServicePublishersResponse unmarshall(QueryMsSgServicePublishersResponse queryMsSgServicePublishersResponse, UnmarshallerContext _ctx) {
		
		queryMsSgServicePublishersResponse.setRequestId(_ctx.stringValue("QueryMsSgServicePublishersResponse.RequestId"));
		queryMsSgServicePublishersResponse.setResultCode(_ctx.stringValue("QueryMsSgServicePublishersResponse.ResultCode"));
		queryMsSgServicePublishersResponse.setResultMessage(_ctx.stringValue("QueryMsSgServicePublishersResponse.ResultMessage"));
		queryMsSgServicePublishersResponse.setCurrentPage(_ctx.longValue("QueryMsSgServicePublishersResponse.CurrentPage"));
		queryMsSgServicePublishersResponse.setPageSize(_ctx.longValue("QueryMsSgServicePublishersResponse.PageSize"));
		queryMsSgServicePublishersResponse.setStartIndex(_ctx.longValue("QueryMsSgServicePublishersResponse.StartIndex"));
		queryMsSgServicePublishersResponse.setTotalSize(_ctx.longValue("QueryMsSgServicePublishersResponse.TotalSize"));

		List<PublishersItem> publishers = new ArrayList<PublishersItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMsSgServicePublishersResponse.Publishers.Length"); i++) {
			PublishersItem publishersItem = new PublishersItem();
			publishersItem.setAlive(_ctx.booleanValue("QueryMsSgServicePublishersResponse.Publishers["+ i +"].Alive"));
			publishersItem.setAppName(_ctx.stringValue("QueryMsSgServicePublishersResponse.Publishers["+ i +"].AppName"));
			publishersItem.setAppVersion(_ctx.stringValue("QueryMsSgServicePublishersResponse.Publishers["+ i +"].AppVersion"));
			publishersItem.setCheckSum(_ctx.stringValue("QueryMsSgServicePublishersResponse.Publishers["+ i +"].CheckSum"));
			publishersItem.setConfigWeight(_ctx.stringValue("QueryMsSgServicePublishersResponse.Publishers["+ i +"].ConfigWeight"));
			publishersItem.setContent(_ctx.stringValue("QueryMsSgServicePublishersResponse.Publishers["+ i +"].Content"));
			publishersItem.setDataId(_ctx.stringValue("QueryMsSgServicePublishersResponse.Publishers["+ i +"].DataId"));
			publishersItem.setHostIp(_ctx.stringValue("QueryMsSgServicePublishersResponse.Publishers["+ i +"].HostIp"));
			publishersItem.setId(_ctx.longValue("QueryMsSgServicePublishersResponse.Publishers["+ i +"].Id"));
			publishersItem.setInstanceId(_ctx.stringValue("QueryMsSgServicePublishersResponse.Publishers["+ i +"].InstanceId"));
			publishersItem.setMosn(_ctx.booleanValue("QueryMsSgServicePublishersResponse.Publishers["+ i +"].Mosn"));
			publishersItem.setProcessId(_ctx.stringValue("QueryMsSgServicePublishersResponse.Publishers["+ i +"].ProcessId"));
			publishersItem.setBizProtocol(_ctx.stringValue("QueryMsSgServicePublishersResponse.Publishers["+ i +"].Protocol"));
			publishersItem.setServiceIp(_ctx.stringValue("QueryMsSgServicePublishersResponse.Publishers["+ i +"].ServiceIp"));
			publishersItem.setServicePort(_ctx.longValue("QueryMsSgServicePublishersResponse.Publishers["+ i +"].ServicePort"));
			publishersItem.setStatus(_ctx.booleanValue("QueryMsSgServicePublishersResponse.Publishers["+ i +"].Status"));
			publishersItem.setTimeout(_ctx.longValue("QueryMsSgServicePublishersResponse.Publishers["+ i +"].Timeout"));
			publishersItem.setVmMode(_ctx.booleanValue("QueryMsSgServicePublishersResponse.Publishers["+ i +"].VmMode"));
			publishersItem.setWeight(_ctx.longValue("QueryMsSgServicePublishersResponse.Publishers["+ i +"].Weight"));
			publishersItem.setZone(_ctx.stringValue("QueryMsSgServicePublishersResponse.Publishers["+ i +"].Zone"));

			publishers.add(publishersItem);
		}
		queryMsSgServicePublishersResponse.setPublishers(publishers);
	 
	 	return queryMsSgServicePublishersResponse;
	}
}