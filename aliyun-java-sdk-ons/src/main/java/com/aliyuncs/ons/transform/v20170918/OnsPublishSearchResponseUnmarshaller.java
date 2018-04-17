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

package com.aliyuncs.ons.transform.v20170918;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ons.model.v20170918.OnsPublishSearchResponse;
import com.aliyuncs.ons.model.v20170918.OnsPublishSearchResponse.PublishInfoDo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsPublishSearchResponseUnmarshaller {

	public static OnsPublishSearchResponse unmarshall(OnsPublishSearchResponse onsPublishSearchResponse, UnmarshallerContext context) {
		
		onsPublishSearchResponse.setRequestId(context.stringValue("OnsPublishSearchResponse.RequestId"));
		onsPublishSearchResponse.setHelpUrl(context.stringValue("OnsPublishSearchResponse.HelpUrl"));

		List<PublishInfoDo> data = new ArrayList<PublishInfoDo>();
		for (int i = 0; i < context.lengthValue("OnsPublishSearchResponse.Data.Length"); i++) {
			PublishInfoDo publishInfoDo = new PublishInfoDo();
			publishInfoDo.setId(context.longValue("OnsPublishSearchResponse.Data["+ i +"].Id"));
			publishInfoDo.setChannelId(context.integerValue("OnsPublishSearchResponse.Data["+ i +"].ChannelId"));
			publishInfoDo.setChannelName(context.stringValue("OnsPublishSearchResponse.Data["+ i +"].ChannelName"));
			publishInfoDo.setOnsRegionId(context.stringValue("OnsPublishSearchResponse.Data["+ i +"].OnsRegionId"));
			publishInfoDo.setRegionName(context.stringValue("OnsPublishSearchResponse.Data["+ i +"].RegionName"));
			publishInfoDo.setOwner(context.stringValue("OnsPublishSearchResponse.Data["+ i +"].Owner"));
			publishInfoDo.setProducerId(context.stringValue("OnsPublishSearchResponse.Data["+ i +"].ProducerId"));
			publishInfoDo.setTopic(context.stringValue("OnsPublishSearchResponse.Data["+ i +"].Topic"));
			publishInfoDo.setStatus(context.integerValue("OnsPublishSearchResponse.Data["+ i +"].Status"));
			publishInfoDo.setStatusName(context.stringValue("OnsPublishSearchResponse.Data["+ i +"].StatusName"));
			publishInfoDo.setCreateTime(context.longValue("OnsPublishSearchResponse.Data["+ i +"].CreateTime"));
			publishInfoDo.setUpdateTime(context.longValue("OnsPublishSearchResponse.Data["+ i +"].UpdateTime"));

			data.add(publishInfoDo);
		}
		onsPublishSearchResponse.setData(data);
	 
	 	return onsPublishSearchResponse;
	}
}