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

package com.aliyuncs.vod.transform.v20170321;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.vod.model.v20170321.ListWatermarkResponse;
import com.aliyuncs.vod.model.v20170321.ListWatermarkResponse.WatermarkInfo;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListWatermarkResponseUnmarshaller {

	public static ListWatermarkResponse unmarshall(ListWatermarkResponse listWatermarkResponse, UnmarshallerContext context) {
		
		listWatermarkResponse.setRequestId(context.stringValue("ListWatermarkResponse.RequestId"));

		List<WatermarkInfo> watermarkInfos = new ArrayList<WatermarkInfo>();
		for (int i = 0; i < context.lengthValue("ListWatermarkResponse.WatermarkInfos.Length"); i++) {
			WatermarkInfo watermarkInfo = new WatermarkInfo();
			watermarkInfo.setCreationTime(context.stringValue("ListWatermarkResponse.WatermarkInfos["+ i +"].CreationTime"));
			watermarkInfo.setType(context.stringValue("ListWatermarkResponse.WatermarkInfos["+ i +"].Type"));
			watermarkInfo.setIsDefault(context.stringValue("ListWatermarkResponse.WatermarkInfos["+ i +"].IsDefault"));
			watermarkInfo.setWatermarkId(context.stringValue("ListWatermarkResponse.WatermarkInfos["+ i +"].WatermarkId"));
			watermarkInfo.setName(context.stringValue("ListWatermarkResponse.WatermarkInfos["+ i +"].Name"));
			watermarkInfo.setFileUrl(context.stringValue("ListWatermarkResponse.WatermarkInfos["+ i +"].FileUrl"));
			watermarkInfo.setWatermarkConfig(context.stringValue("ListWatermarkResponse.WatermarkInfos["+ i +"].WatermarkConfig"));

			watermarkInfos.add(watermarkInfo);
		}
		listWatermarkResponse.setWatermarkInfos(watermarkInfos);
	 
	 	return listWatermarkResponse;
	}
}