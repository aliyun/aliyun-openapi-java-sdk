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

import com.aliyuncs.sofa.model.v20190815.QueryMSServicePublisherResponse;
import com.aliyuncs.sofa.model.v20190815.QueryMSServicePublisherResponse.PublishersItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryMSServicePublisherResponseUnmarshaller {

	public static QueryMSServicePublisherResponse unmarshall(QueryMSServicePublisherResponse queryMSServicePublisherResponse, UnmarshallerContext _ctx) {
		
		queryMSServicePublisherResponse.setRequestId(_ctx.stringValue("QueryMSServicePublisherResponse.RequestId"));
		queryMSServicePublisherResponse.setPageNum(_ctx.integerValue("QueryMSServicePublisherResponse.PageNum"));
		queryMSServicePublisherResponse.setPageSize(_ctx.integerValue("QueryMSServicePublisherResponse.PageSize"));
		queryMSServicePublisherResponse.setTotalCount(_ctx.integerValue("QueryMSServicePublisherResponse.TotalCount"));

		List<PublishersItem> publishers = new ArrayList<PublishersItem>();
		for (int i = 0; i < _ctx.lengthValue("QueryMSServicePublisherResponse.Publishers.Length"); i++) {
			PublishersItem publishersItem = new PublishersItem();
			publishersItem.setAppName(_ctx.stringValue("QueryMSServicePublisherResponse.Publishers["+ i +"].AppName"));
			publishersItem.setDataId(_ctx.stringValue("QueryMSServicePublisherResponse.Publishers["+ i +"].DataId"));
			publishersItem.setHostIp(_ctx.stringValue("QueryMSServicePublisherResponse.Publishers["+ i +"].HostIp"));
			publishersItem.setInstanceId(_ctx.stringValue("QueryMSServicePublisherResponse.Publishers["+ i +"].InstanceId"));
			publishersItem.setServiceIp(_ctx.stringValue("QueryMSServicePublisherResponse.Publishers["+ i +"].ServiceIp"));
			publishersItem.setServicePort(_ctx.integerValue("QueryMSServicePublisherResponse.Publishers["+ i +"].ServicePort"));
			publishersItem.setWeight(_ctx.integerValue("QueryMSServicePublisherResponse.Publishers["+ i +"].Weight"));
			publishersItem.setZone(_ctx.stringValue("QueryMSServicePublisherResponse.Publishers["+ i +"].Zone"));

			publishers.add(publishersItem);
		}
		queryMSServicePublisherResponse.setPublishers(publishers);
	 
	 	return queryMSServicePublisherResponse;
	}
}