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

package com.aliyuncs.iot.transform.v20180120;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.iot.model.v20180120.QueryConsumerGroupListResponse;
import com.aliyuncs.iot.model.v20180120.QueryConsumerGroupListResponse.ConsumerGroupDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryConsumerGroupListResponseUnmarshaller {

	public static QueryConsumerGroupListResponse unmarshall(QueryConsumerGroupListResponse queryConsumerGroupListResponse, UnmarshallerContext _ctx) {
		
		queryConsumerGroupListResponse.setRequestId(_ctx.stringValue("QueryConsumerGroupListResponse.RequestId"));
		queryConsumerGroupListResponse.setSuccess(_ctx.booleanValue("QueryConsumerGroupListResponse.Success"));
		queryConsumerGroupListResponse.setErrorMessage(_ctx.stringValue("QueryConsumerGroupListResponse.ErrorMessage"));
		queryConsumerGroupListResponse.setPageSize(_ctx.integerValue("QueryConsumerGroupListResponse.PageSize"));
		queryConsumerGroupListResponse.setPageCount(_ctx.integerValue("QueryConsumerGroupListResponse.PageCount"));
		queryConsumerGroupListResponse.setTotal(_ctx.integerValue("QueryConsumerGroupListResponse.Total"));
		queryConsumerGroupListResponse.setCurrentPage(_ctx.integerValue("QueryConsumerGroupListResponse.CurrentPage"));
		queryConsumerGroupListResponse.setCode(_ctx.stringValue("QueryConsumerGroupListResponse.Code"));

		List<ConsumerGroupDTO> data = new ArrayList<ConsumerGroupDTO>();
		for (int i = 0; i < _ctx.lengthValue("QueryConsumerGroupListResponse.Data.Length"); i++) {
			ConsumerGroupDTO consumerGroupDTO = new ConsumerGroupDTO();
			consumerGroupDTO.setIotId(_ctx.stringValue("QueryConsumerGroupListResponse.Data["+ i +"].IotId"));
			consumerGroupDTO.setGroupId(_ctx.stringValue("QueryConsumerGroupListResponse.Data["+ i +"].GroupId"));
			consumerGroupDTO.setGroupName(_ctx.stringValue("QueryConsumerGroupListResponse.Data["+ i +"].GroupName"));
			consumerGroupDTO.setCreator(_ctx.stringValue("QueryConsumerGroupListResponse.Data["+ i +"].Creator"));
			consumerGroupDTO.setCreateTime(_ctx.stringValue("QueryConsumerGroupListResponse.Data["+ i +"].CreateTime"));
			consumerGroupDTO.setAuthType(_ctx.stringValue("QueryConsumerGroupListResponse.Data["+ i +"].AuthType"));
			consumerGroupDTO.setCloudCommodityType(_ctx.stringValue("QueryConsumerGroupListResponse.Data["+ i +"].CloudCommodityType"));

			data.add(consumerGroupDTO);
		}
		queryConsumerGroupListResponse.setData(data);
	 
	 	return queryConsumerGroupListResponse;
	}
}