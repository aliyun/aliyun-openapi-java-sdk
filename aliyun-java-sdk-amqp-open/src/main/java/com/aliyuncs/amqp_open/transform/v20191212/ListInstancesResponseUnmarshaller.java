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

package com.aliyuncs.amqp_open.transform.v20191212;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.amqp_open.model.v20191212.ListInstancesResponse;
import com.aliyuncs.amqp_open.model.v20191212.ListInstancesResponse.Data;
import com.aliyuncs.amqp_open.model.v20191212.ListInstancesResponse.Data.InstanceVO;
import com.aliyuncs.amqp_open.model.v20191212.ListInstancesResponse.Data.InstanceVO.TagsItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstancesResponseUnmarshaller {

	public static ListInstancesResponse unmarshall(ListInstancesResponse listInstancesResponse, UnmarshallerContext _ctx) {
		
		listInstancesResponse.setRequestId(_ctx.stringValue("ListInstancesResponse.RequestId"));

		Data data = new Data();
		data.setNextToken(_ctx.stringValue("ListInstancesResponse.Data.NextToken"));
		data.setMaxResults(_ctx.integerValue("ListInstancesResponse.Data.MaxResults"));

		List<InstanceVO> instances = new ArrayList<InstanceVO>();
		for (int i = 0; i < _ctx.lengthValue("ListInstancesResponse.Data.Instances.Length"); i++) {
			InstanceVO instanceVO = new InstanceVO();
			instanceVO.setStatus(_ctx.stringValue("ListInstancesResponse.Data.Instances["+ i +"].Status"));
			instanceVO.setSupportEIP(_ctx.booleanValue("ListInstancesResponse.Data.Instances["+ i +"].SupportEIP"));
			instanceVO.setExpireTime(_ctx.longValue("ListInstancesResponse.Data.Instances["+ i +"].ExpireTime"));
			instanceVO.setOrderCreateTime(_ctx.longValue("ListInstancesResponse.Data.Instances["+ i +"].OrderCreateTime"));
			instanceVO.setPrivateEndpoint(_ctx.stringValue("ListInstancesResponse.Data.Instances["+ i +"].PrivateEndpoint"));
			instanceVO.setStorageSize(_ctx.integerValue("ListInstancesResponse.Data.Instances["+ i +"].StorageSize"));
			instanceVO.setMaxEipTps(_ctx.integerValue("ListInstancesResponse.Data.Instances["+ i +"].MaxEipTps"));
			instanceVO.setInstanceId(_ctx.stringValue("ListInstancesResponse.Data.Instances["+ i +"].InstanceId"));
			instanceVO.setInstanceType(_ctx.stringValue("ListInstancesResponse.Data.Instances["+ i +"].InstanceType"));
			instanceVO.setPublicEndpoint(_ctx.stringValue("ListInstancesResponse.Data.Instances["+ i +"].PublicEndpoint"));
			instanceVO.setClassicEndpoint(_ctx.stringValue("ListInstancesResponse.Data.Instances["+ i +"].ClassicEndpoint"));
			instanceVO.setMaxVhost(_ctx.integerValue("ListInstancesResponse.Data.Instances["+ i +"].MaxVhost"));
			instanceVO.setMaxTps(_ctx.integerValue("ListInstancesResponse.Data.Instances["+ i +"].MaxTps"));
			instanceVO.setAutoRenewInstance(_ctx.booleanValue("ListInstancesResponse.Data.Instances["+ i +"].AutoRenewInstance"));
			instanceVO.setInstanceName(_ctx.stringValue("ListInstancesResponse.Data.Instances["+ i +"].InstanceName"));
			instanceVO.setMaxQueue(_ctx.integerValue("ListInstancesResponse.Data.Instances["+ i +"].MaxQueue"));
			instanceVO.setOrderType(_ctx.stringValue("ListInstancesResponse.Data.Instances["+ i +"].OrderType"));

			List<TagsItem> tags = new ArrayList<TagsItem>();
			for (int j = 0; j < _ctx.lengthValue("ListInstancesResponse.Data.Instances["+ i +"].Tags.Length"); j++) {
				TagsItem tagsItem = new TagsItem();
				tagsItem.setKey(_ctx.stringValue("ListInstancesResponse.Data.Instances["+ i +"].Tags["+ j +"].Key"));
				tagsItem.setValue(_ctx.stringValue("ListInstancesResponse.Data.Instances["+ i +"].Tags["+ j +"].Value"));

				tags.add(tagsItem);
			}
			instanceVO.setTags(tags);

			instances.add(instanceVO);
		}
		data.setInstances(instances);
		listInstancesResponse.setData(data);
	 
	 	return listInstancesResponse;
	}
}