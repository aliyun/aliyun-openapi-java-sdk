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

package com.aliyuncs.eflo.transform.v20220530;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.eflo.model.v20220530.ListInstancesByNcdResponse;
import com.aliyuncs.eflo.model.v20220530.ListInstancesByNcdResponse.Content;
import com.aliyuncs.eflo.model.v20220530.ListInstancesByNcdResponse.Content.InstanceInfo;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListInstancesByNcdResponseUnmarshaller {

	public static ListInstancesByNcdResponse unmarshall(ListInstancesByNcdResponse listInstancesByNcdResponse, UnmarshallerContext _ctx) {
		
		listInstancesByNcdResponse.setRequestId(_ctx.stringValue("ListInstancesByNcdResponse.RequestId"));
		listInstancesByNcdResponse.setCode(_ctx.integerValue("ListInstancesByNcdResponse.Code"));
		listInstancesByNcdResponse.setMessage(_ctx.stringValue("ListInstancesByNcdResponse.Message"));

		Content content = new Content();
		content.setMaxNcd(_ctx.integerValue("ListInstancesByNcdResponse.Content.MaxNcd"));
		content.setInstanceType(_ctx.stringValue("ListInstancesByNcdResponse.Content.InstanceType"));
		content.setSourceInstanceId(_ctx.stringValue("ListInstancesByNcdResponse.Content.SourceInstanceId"));

		List<InstanceInfo> instanceInfos = new ArrayList<InstanceInfo>();
		for (int i = 0; i < _ctx.lengthValue("ListInstancesByNcdResponse.Content.InstanceInfos.Length"); i++) {
			InstanceInfo instanceInfo = new InstanceInfo();
			instanceInfo.setInstanceId(_ctx.stringValue("ListInstancesByNcdResponse.Content.InstanceInfos["+ i +"].InstanceId"));
			instanceInfo.setNcd(_ctx.integerValue("ListInstancesByNcdResponse.Content.InstanceInfos["+ i +"].Ncd"));

			instanceInfos.add(instanceInfo);
		}
		content.setInstanceInfos(instanceInfos);
		listInstancesByNcdResponse.setContent(content);
	 
	 	return listInstancesByNcdResponse;
	}
}