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

package com.aliyuncs.onsmqtt.transform.v20200420;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.onsmqtt.model.v20200420.ListInstancesResponse;
import com.aliyuncs.onsmqtt.model.v20200420.ListInstancesResponse.MqttInstanceVO;
import com.aliyuncs.onsmqtt.model.v20200420.ListInstancesResponse.MqttInstanceVO.TagResourceDTO;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstancesResponseUnmarshaller {

	public static ListInstancesResponse unmarshall(ListInstancesResponse listInstancesResponse, UnmarshallerContext _ctx) {
		
		listInstancesResponse.setRequestId(_ctx.stringValue("ListInstancesResponse.RequestId"));
		listInstancesResponse.setCode(_ctx.stringValue("ListInstancesResponse.Code"));
		listInstancesResponse.setMessage(_ctx.stringValue("ListInstancesResponse.Message"));
		listInstancesResponse.setSuccess(_ctx.stringValue("ListInstancesResponse.Success"));

		List<MqttInstanceVO> instances = new ArrayList<MqttInstanceVO>();
		for (int i = 0; i < _ctx.lengthValue("ListInstancesResponse.Instances.Length"); i++) {
			MqttInstanceVO mqttInstanceVO = new MqttInstanceVO();
			mqttInstanceVO.setInstanceId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].InstanceId"));
			mqttInstanceVO.setInstanceName(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].InstanceName"));
			mqttInstanceVO.setInstanceStatus(_ctx.integerValue("ListInstancesResponse.Instances["+ i +"].InstanceStatus"));
			mqttInstanceVO.setInstanceType(_ctx.integerValue("ListInstancesResponse.Instances["+ i +"].InstanceType"));
			mqttInstanceVO.setSpecific(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].Specific"));
			mqttInstanceVO.setRegionId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].RegionId"));
			mqttInstanceVO.setCreateTime(_ctx.longValue("ListInstancesResponse.Instances["+ i +"].CreateTime"));
			mqttInstanceVO.setExpireTime(_ctx.longValue("ListInstancesResponse.Instances["+ i +"].ExpireTime"));
			mqttInstanceVO.setKernelVersion(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].KernelVersion"));
			mqttInstanceVO.setOrderId(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].OrderId"));

			List<TagResourceDTO> mqttTags = new ArrayList<TagResourceDTO>();
			for (int j = 0; j < _ctx.lengthValue("ListInstancesResponse.Instances["+ i +"].MqttTags.Length"); j++) {
				TagResourceDTO tagResourceDTO = new TagResourceDTO();
				tagResourceDTO.setTagKey(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].MqttTags["+ j +"].TagKey"));
				tagResourceDTO.setTagValue(_ctx.stringValue("ListInstancesResponse.Instances["+ i +"].MqttTags["+ j +"].TagValue"));

				mqttTags.add(tagResourceDTO);
			}
			mqttInstanceVO.setMqttTags(mqttTags);

			instances.add(mqttInstanceVO);
		}
		listInstancesResponse.setInstances(instances);
	 
	 	return listInstancesResponse;
	}
}