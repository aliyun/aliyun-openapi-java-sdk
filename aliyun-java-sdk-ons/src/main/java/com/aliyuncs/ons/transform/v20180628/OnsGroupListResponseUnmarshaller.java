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

package com.aliyuncs.ons.transform.v20180628;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ons.model.v20180628.OnsGroupListResponse;
import com.aliyuncs.ons.model.v20180628.OnsGroupListResponse.SubscribeInfoDo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsGroupListResponseUnmarshaller {

	public static OnsGroupListResponse unmarshall(OnsGroupListResponse onsGroupListResponse, UnmarshallerContext context) {
		
		onsGroupListResponse.setRequestId(context.stringValue("OnsGroupListResponse.RequestId"));
		onsGroupListResponse.setHelpUrl(context.stringValue("OnsGroupListResponse.HelpUrl"));

		List<SubscribeInfoDo> data = new ArrayList<SubscribeInfoDo>();
		for (int i = 0; i < context.lengthValue("OnsGroupListResponse.Data.Length"); i++) {
			SubscribeInfoDo subscribeInfoDo = new SubscribeInfoDo();
			subscribeInfoDo.setOwner(context.stringValue("OnsGroupListResponse.Data["+ i +"].Owner"));
			subscribeInfoDo.setGroupId(context.stringValue("OnsGroupListResponse.Data["+ i +"].GroupId"));
			subscribeInfoDo.setStatus(context.integerValue("OnsGroupListResponse.Data["+ i +"].Status"));
			subscribeInfoDo.setStatusName(context.stringValue("OnsGroupListResponse.Data["+ i +"].StatusName"));
			subscribeInfoDo.setCreateTime(context.longValue("OnsGroupListResponse.Data["+ i +"].CreateTime"));
			subscribeInfoDo.setUpdateTime(context.longValue("OnsGroupListResponse.Data["+ i +"].UpdateTime"));
			subscribeInfoDo.setRemark(context.stringValue("OnsGroupListResponse.Data["+ i +"].Remark"));
			subscribeInfoDo.setInstanceId(context.stringValue("OnsGroupListResponse.Data["+ i +"].InstanceId"));

			data.add(subscribeInfoDo);
		}
		onsGroupListResponse.setData(data);
	 
	 	return onsGroupListResponse;
	}
}