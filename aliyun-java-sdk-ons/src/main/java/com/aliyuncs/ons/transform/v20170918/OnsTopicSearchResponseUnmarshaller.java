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

import com.aliyuncs.ons.model.v20170918.OnsTopicSearchResponse;
import com.aliyuncs.ons.model.v20170918.OnsTopicSearchResponse.PublishInfoDo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsTopicSearchResponseUnmarshaller {

	public static OnsTopicSearchResponse unmarshall(OnsTopicSearchResponse onsTopicSearchResponse, UnmarshallerContext context) {
		
		onsTopicSearchResponse.setRequestId(context.stringValue("OnsTopicSearchResponse.RequestId"));
		onsTopicSearchResponse.setHelpUrl(context.stringValue("OnsTopicSearchResponse.HelpUrl"));

		List<PublishInfoDo> data = new ArrayList<PublishInfoDo>();
		for (int i = 0; i < context.lengthValue("OnsTopicSearchResponse.Data.Length"); i++) {
			PublishInfoDo publishInfoDo = new PublishInfoDo();
			publishInfoDo.setId(context.longValue("OnsTopicSearchResponse.Data["+ i +"].Id"));
			publishInfoDo.setChannelId(context.integerValue("OnsTopicSearchResponse.Data["+ i +"].ChannelId"));
			publishInfoDo.setChannelName(context.stringValue("OnsTopicSearchResponse.Data["+ i +"].ChannelName"));
			publishInfoDo.setOnsRegionId(context.stringValue("OnsTopicSearchResponse.Data["+ i +"].OnsRegionId"));
			publishInfoDo.setRegionName(context.stringValue("OnsTopicSearchResponse.Data["+ i +"].RegionName"));
			publishInfoDo.setTopic(context.stringValue("OnsTopicSearchResponse.Data["+ i +"].Topic"));
			publishInfoDo.setOwner(context.stringValue("OnsTopicSearchResponse.Data["+ i +"].Owner"));
			publishInfoDo.setRelation(context.integerValue("OnsTopicSearchResponse.Data["+ i +"].Relation"));
			publishInfoDo.setRelationName(context.stringValue("OnsTopicSearchResponse.Data["+ i +"].RelationName"));
			publishInfoDo.setStatus(context.integerValue("OnsTopicSearchResponse.Data["+ i +"].Status"));
			publishInfoDo.setStatusName(context.stringValue("OnsTopicSearchResponse.Data["+ i +"].StatusName"));
			publishInfoDo.setAppkey(context.stringValue("OnsTopicSearchResponse.Data["+ i +"].Appkey"));
			publishInfoDo.setCreateTime(context.longValue("OnsTopicSearchResponse.Data["+ i +"].CreateTime"));
			publishInfoDo.setUpdateTime(context.longValue("OnsTopicSearchResponse.Data["+ i +"].UpdateTime"));
			publishInfoDo.setRemark(context.stringValue("OnsTopicSearchResponse.Data["+ i +"].Remark"));

			data.add(publishInfoDo);
		}
		onsTopicSearchResponse.setData(data);
	 
	 	return onsTopicSearchResponse;
	}
}