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

package com.aliyuncs.ons.transform.v20180516;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ons.model.v20180516.OnsPublishGetResponse;
import com.aliyuncs.ons.model.v20180516.OnsPublishGetResponse.PublishInfoDo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsPublishGetResponseUnmarshaller {

	public static OnsPublishGetResponse unmarshall(OnsPublishGetResponse onsPublishGetResponse, UnmarshallerContext context) {
		
		onsPublishGetResponse.setRequestId(context.stringValue("OnsPublishGetResponse.RequestId"));
		onsPublishGetResponse.setHelpUrl(context.stringValue("OnsPublishGetResponse.HelpUrl"));

		List<PublishInfoDo> data = new ArrayList<PublishInfoDo>();
		for (int i = 0; i < context.lengthValue("OnsPublishGetResponse.Data.Length"); i++) {
			PublishInfoDo publishInfoDo = new PublishInfoDo();
			publishInfoDo.setId(context.longValue("OnsPublishGetResponse.Data["+ i +"].Id"));
			publishInfoDo.setChannelId(context.integerValue("OnsPublishGetResponse.Data["+ i +"].ChannelId"));
			publishInfoDo.setChannelName(context.stringValue("OnsPublishGetResponse.Data["+ i +"].ChannelName"));
			publishInfoDo.setOwner(context.stringValue("OnsPublishGetResponse.Data["+ i +"].Owner"));
			publishInfoDo.setProducerId(context.stringValue("OnsPublishGetResponse.Data["+ i +"].ProducerId"));
			publishInfoDo.setTopic(context.stringValue("OnsPublishGetResponse.Data["+ i +"].Topic"));
			publishInfoDo.setStatus(context.integerValue("OnsPublishGetResponse.Data["+ i +"].Status"));
			publishInfoDo.setStatusName(context.stringValue("OnsPublishGetResponse.Data["+ i +"].StatusName"));
			publishInfoDo.setCreateTime(context.longValue("OnsPublishGetResponse.Data["+ i +"].CreateTime"));
			publishInfoDo.setUpdateTime(context.longValue("OnsPublishGetResponse.Data["+ i +"].UpdateTime"));

			data.add(publishInfoDo);
		}
		onsPublishGetResponse.setData(data);
	 
	 	return onsPublishGetResponse;
	}
}