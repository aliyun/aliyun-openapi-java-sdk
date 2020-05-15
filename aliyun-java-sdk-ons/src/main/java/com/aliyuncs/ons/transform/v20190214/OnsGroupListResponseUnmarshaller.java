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

package com.aliyuncs.ons.transform.v20190214;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ons.model.v20190214.OnsGroupListResponse;
import com.aliyuncs.ons.model.v20190214.OnsGroupListResponse.SubscribeInfoDo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsGroupListResponseUnmarshaller {

	public static OnsGroupListResponse unmarshall(OnsGroupListResponse onsGroupListResponse, UnmarshallerContext _ctx) {
		
		onsGroupListResponse.setRequestId(_ctx.stringValue("OnsGroupListResponse.RequestId"));
		onsGroupListResponse.setHelpUrl(_ctx.stringValue("OnsGroupListResponse.HelpUrl"));

		List<SubscribeInfoDo> data = new ArrayList<SubscribeInfoDo>();
		for (int i = 0; i < _ctx.lengthValue("OnsGroupListResponse.Data.Length"); i++) {
			SubscribeInfoDo subscribeInfoDo = new SubscribeInfoDo();
			subscribeInfoDo.setOwner(_ctx.stringValue("OnsGroupListResponse.Data["+ i +"].Owner"));
			subscribeInfoDo.setGroupId(_ctx.stringValue("OnsGroupListResponse.Data["+ i +"].GroupId"));
			subscribeInfoDo.setUpdateTime(_ctx.longValue("OnsGroupListResponse.Data["+ i +"].UpdateTime"));
			subscribeInfoDo.setRemark(_ctx.stringValue("OnsGroupListResponse.Data["+ i +"].Remark"));
			subscribeInfoDo.setInstanceId(_ctx.stringValue("OnsGroupListResponse.Data["+ i +"].InstanceId"));
			subscribeInfoDo.setIndependentNaming(_ctx.booleanValue("OnsGroupListResponse.Data["+ i +"].IndependentNaming"));
			subscribeInfoDo.setCreateTime(_ctx.longValue("OnsGroupListResponse.Data["+ i +"].CreateTime"));
			subscribeInfoDo.setGroupType(_ctx.stringValue("OnsGroupListResponse.Data["+ i +"].GroupType"));

			data.add(subscribeInfoDo);
		}
		onsGroupListResponse.setData(data);
	 
	 	return onsGroupListResponse;
	}
}