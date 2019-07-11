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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.ListConvertableEcuResponse;
import com.aliyuncs.edas.model.v20170801.ListConvertableEcuResponse.Instance;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListConvertableEcuResponseUnmarshaller {

	public static ListConvertableEcuResponse unmarshall(ListConvertableEcuResponse listConvertableEcuResponse, UnmarshallerContext _ctx) {
		
		listConvertableEcuResponse.setRequestId(_ctx.stringValue("ListConvertableEcuResponse.RequestId"));
		listConvertableEcuResponse.setCode(_ctx.integerValue("ListConvertableEcuResponse.Code"));
		listConvertableEcuResponse.setMessage(_ctx.stringValue("ListConvertableEcuResponse.Message"));

		List<Instance> instanceList = new ArrayList<Instance>();
		for (int i = 0; i < _ctx.lengthValue("ListConvertableEcuResponse.InstanceList.Length"); i++) {
			Instance instance = new Instance();
			instance.setInstanceId(_ctx.stringValue("ListConvertableEcuResponse.InstanceList["+ i +"].InstanceId"));
			instance.setInstanceName(_ctx.stringValue("ListConvertableEcuResponse.InstanceList["+ i +"].InstanceName"));
			instance.setEcuId(_ctx.stringValue("ListConvertableEcuResponse.InstanceList["+ i +"].EcuId"));
			instance.setVpcId(_ctx.stringValue("ListConvertableEcuResponse.InstanceList["+ i +"].VpcId"));
			instance.setVpcName(_ctx.stringValue("ListConvertableEcuResponse.InstanceList["+ i +"].VpcName"));
			instance.setExpired(_ctx.booleanValue("ListConvertableEcuResponse.InstanceList["+ i +"].Expired"));
			instance.setStatus(_ctx.stringValue("ListConvertableEcuResponse.InstanceList["+ i +"].Status"));
			instance.setRegionId(_ctx.stringValue("ListConvertableEcuResponse.InstanceList["+ i +"].RegionId"));
			instance.setCpu(_ctx.integerValue("ListConvertableEcuResponse.InstanceList["+ i +"].Cpu"));
			instance.setMem(_ctx.integerValue("ListConvertableEcuResponse.InstanceList["+ i +"].Mem"));
			instance.setPublicIp(_ctx.stringValue("ListConvertableEcuResponse.InstanceList["+ i +"].PublicIp"));
			instance.setInnerIp(_ctx.stringValue("ListConvertableEcuResponse.InstanceList["+ i +"].InnerIp"));
			instance.setPrivateIp(_ctx.stringValue("ListConvertableEcuResponse.InstanceList["+ i +"].PrivateIp"));
			instance.setEip(_ctx.stringValue("ListConvertableEcuResponse.InstanceList["+ i +"].Eip"));

			instanceList.add(instance);
		}
		listConvertableEcuResponse.setInstanceList(instanceList);
	 
	 	return listConvertableEcuResponse;
	}
}