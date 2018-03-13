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

import com.aliyuncs.ons.model.v20170918.OnsRegionListResponse;
import com.aliyuncs.ons.model.v20170918.OnsRegionListResponse.RegionDo;
import com.aliyuncs.transform.UnmarshallerContext;


public class OnsRegionListResponseUnmarshaller {

	public static OnsRegionListResponse unmarshall(OnsRegionListResponse onsRegionListResponse, UnmarshallerContext context) {
		
		onsRegionListResponse.setRequestId(context.stringValue("OnsRegionListResponse.RequestId"));
		onsRegionListResponse.setHelpUrl(context.stringValue("OnsRegionListResponse.HelpUrl"));

		List<RegionDo> data = new ArrayList<RegionDo>();
		for (int i = 0; i < context.lengthValue("OnsRegionListResponse.Data.Length"); i++) {
			RegionDo regionDo = new RegionDo();
			regionDo.setId(context.longValue("OnsRegionListResponse.Data["+ i +"].Id"));
			regionDo.setOnsRegionId(context.stringValue("OnsRegionListResponse.Data["+ i +"].OnsRegionId"));
			regionDo.setRegionName(context.stringValue("OnsRegionListResponse.Data["+ i +"].RegionName"));
			regionDo.setChannelId(context.integerValue("OnsRegionListResponse.Data["+ i +"].ChannelId"));
			regionDo.setChannelName(context.stringValue("OnsRegionListResponse.Data["+ i +"].ChannelName"));
			regionDo.setCreateTime(context.longValue("OnsRegionListResponse.Data["+ i +"].CreateTime"));
			regionDo.setUpdateTime(context.longValue("OnsRegionListResponse.Data["+ i +"].UpdateTime"));

			data.add(regionDo);
		}
		onsRegionListResponse.setData(data);
	 
	 	return onsRegionListResponse;
	}
}