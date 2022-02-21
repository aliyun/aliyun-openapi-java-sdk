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

import com.aliyuncs.ons.model.v20190214.OnsTopicListResponse;
import com.aliyuncs.ons.model.v20190214.OnsTopicListResponse.PublishInfoDo;
import com.aliyuncs.ons.model.v20190214.OnsTopicListResponse.PublishInfoDo.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsTopicListResponseUnmarshaller {

	public static OnsTopicListResponse unmarshall(OnsTopicListResponse onsTopicListResponse, UnmarshallerContext _ctx) {
		
		onsTopicListResponse.setRequestId(_ctx.stringValue("OnsTopicListResponse.RequestId"));
		onsTopicListResponse.setHelpUrl(_ctx.stringValue("OnsTopicListResponse.HelpUrl"));

		List<PublishInfoDo> data = new ArrayList<PublishInfoDo>();
		for (int i = 0; i < _ctx.lengthValue("OnsTopicListResponse.Data.Length"); i++) {
			PublishInfoDo publishInfoDo = new PublishInfoDo();
			publishInfoDo.setMessageType(_ctx.integerValue("OnsTopicListResponse.Data["+ i +"].MessageType"));
			publishInfoDo.setRelationName(_ctx.stringValue("OnsTopicListResponse.Data["+ i +"].RelationName"));
			publishInfoDo.setOwner(_ctx.stringValue("OnsTopicListResponse.Data["+ i +"].Owner"));
			publishInfoDo.setIndependentNaming(_ctx.booleanValue("OnsTopicListResponse.Data["+ i +"].IndependentNaming"));
			publishInfoDo.setRemark(_ctx.stringValue("OnsTopicListResponse.Data["+ i +"].Remark"));
			publishInfoDo.setRelation(_ctx.integerValue("OnsTopicListResponse.Data["+ i +"].Relation"));
			publishInfoDo.setCreateTime(_ctx.longValue("OnsTopicListResponse.Data["+ i +"].CreateTime"));
			publishInfoDo.setTopic(_ctx.stringValue("OnsTopicListResponse.Data["+ i +"].Topic"));
			publishInfoDo.setInstanceId(_ctx.stringValue("OnsTopicListResponse.Data["+ i +"].InstanceId"));
			publishInfoDo.setServiceStatus(_ctx.integerValue("OnsTopicListResponse.Data["+ i +"].ServiceStatus"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("OnsTopicListResponse.Data["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("OnsTopicListResponse.Data["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("OnsTopicListResponse.Data["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			publishInfoDo.setTags(tags);

			data.add(publishInfoDo);
		}
		onsTopicListResponse.setData(data);
	 
	 	return onsTopicListResponse;
	}
}