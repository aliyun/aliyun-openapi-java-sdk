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

package com.aliyuncs.alikafka.transform.v20190916;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.alikafka.model.v20190916.GetConsumerListResponse;
import com.aliyuncs.alikafka.model.v20190916.GetConsumerListResponse.ConsumerVO;
import com.aliyuncs.alikafka.model.v20190916.GetConsumerListResponse.ConsumerVO.TagVO;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetConsumerListResponseUnmarshaller {

	public static GetConsumerListResponse unmarshall(GetConsumerListResponse getConsumerListResponse, UnmarshallerContext _ctx) {
		
		getConsumerListResponse.setRequestId(_ctx.stringValue("GetConsumerListResponse.RequestId"));
		getConsumerListResponse.setSuccess(_ctx.booleanValue("GetConsumerListResponse.Success"));
		getConsumerListResponse.setCode(_ctx.integerValue("GetConsumerListResponse.Code"));
		getConsumerListResponse.setMessage(_ctx.stringValue("GetConsumerListResponse.Message"));

		List<ConsumerVO> consumerList = new ArrayList<ConsumerVO>();
		for (int i = 0; i < _ctx.lengthValue("GetConsumerListResponse.ConsumerList.Length"); i++) {
			ConsumerVO consumerVO = new ConsumerVO();
			consumerVO.setRegionId(_ctx.stringValue("GetConsumerListResponse.ConsumerList["+ i +"].RegionId"));
			consumerVO.setInstanceId(_ctx.stringValue("GetConsumerListResponse.ConsumerList["+ i +"].InstanceId"));
			consumerVO.setConsumerId(_ctx.stringValue("GetConsumerListResponse.ConsumerList["+ i +"].ConsumerId"));

			List<TagVO> tags = new ArrayList<TagVO>();
			for (int j = 0; j < _ctx.lengthValue("GetConsumerListResponse.ConsumerList["+ i +"].Tags.Length"); j++) {
				TagVO tagVO = new TagVO();
				tagVO.setKey(_ctx.stringValue("GetConsumerListResponse.ConsumerList["+ i +"].Tags["+ j +"].Key"));
				tagVO.setValue(_ctx.stringValue("GetConsumerListResponse.ConsumerList["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagVO);
			}
			consumerVO.setTags(tags);

			consumerList.add(consumerVO);
		}
		getConsumerListResponse.setConsumerList(consumerList);
	 
	 	return getConsumerListResponse;
	}
}