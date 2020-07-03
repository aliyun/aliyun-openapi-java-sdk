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

import com.aliyuncs.ons.model.v20190214.OnsInstanceInServiceListResponse;
import com.aliyuncs.ons.model.v20190214.OnsInstanceInServiceListResponse.InstanceVO;
import com.aliyuncs.ons.model.v20190214.OnsInstanceInServiceListResponse.InstanceVO.Tag;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsInstanceInServiceListResponseUnmarshaller {

	public static OnsInstanceInServiceListResponse unmarshall(OnsInstanceInServiceListResponse onsInstanceInServiceListResponse, UnmarshallerContext _ctx) {
		
		onsInstanceInServiceListResponse.setRequestId(_ctx.stringValue("OnsInstanceInServiceListResponse.RequestId"));
		onsInstanceInServiceListResponse.setHelpUrl(_ctx.stringValue("OnsInstanceInServiceListResponse.HelpUrl"));

		List<InstanceVO> data = new ArrayList<InstanceVO>();
		for (int i = 0; i < _ctx.lengthValue("OnsInstanceInServiceListResponse.Data.Length"); i++) {
			InstanceVO instanceVO = new InstanceVO();
			instanceVO.setInstanceId(_ctx.stringValue("OnsInstanceInServiceListResponse.Data["+ i +"].InstanceId"));
			instanceVO.setInstanceStatus(_ctx.integerValue("OnsInstanceInServiceListResponse.Data["+ i +"].InstanceStatus"));
			instanceVO.setReleaseTime(_ctx.longValue("OnsInstanceInServiceListResponse.Data["+ i +"].ReleaseTime"));
			instanceVO.setInstanceType(_ctx.integerValue("OnsInstanceInServiceListResponse.Data["+ i +"].InstanceType"));
			instanceVO.setInstanceName(_ctx.stringValue("OnsInstanceInServiceListResponse.Data["+ i +"].InstanceName"));
			instanceVO.setIndependentNaming(_ctx.booleanValue("OnsInstanceInServiceListResponse.Data["+ i +"].IndependentNaming"));

			List<Tag> tags = new ArrayList<Tag>();
			for (int j = 0; j < _ctx.lengthValue("OnsInstanceInServiceListResponse.Data["+ i +"].Tags.Length"); j++) {
				Tag tag = new Tag();
				tag.setKey(_ctx.stringValue("OnsInstanceInServiceListResponse.Data["+ i +"].Tags["+ j +"].Key"));
				tag.setValue(_ctx.stringValue("OnsInstanceInServiceListResponse.Data["+ i +"].Tags["+ j +"].Value"));

				tags.add(tag);
			}
			instanceVO.setTags(tags);

			data.add(instanceVO);
		}
		onsInstanceInServiceListResponse.setData(data);
	 
	 	return onsInstanceInServiceListResponse;
	}
}