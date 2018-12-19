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

package com.aliyuncs.edas.transform.v20170801;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.edas.model.v20170801.ListAliyunRegionResponse;
import com.aliyuncs.edas.model.v20170801.ListAliyunRegionResponse.RegionEntity;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAliyunRegionResponseUnmarshaller {

	public static ListAliyunRegionResponse unmarshall(ListAliyunRegionResponse listAliyunRegionResponse, UnmarshallerContext context) {
		
		listAliyunRegionResponse.setRequestId(context.stringValue("ListAliyunRegionResponse.RequestId"));
		listAliyunRegionResponse.setCode(context.integerValue("ListAliyunRegionResponse.Code"));
		listAliyunRegionResponse.setMessage(context.stringValue("ListAliyunRegionResponse.Message"));

		List<RegionEntity> regionEntityList = new ArrayList<RegionEntity>();
		for (int i = 0; i < context.lengthValue("ListAliyunRegionResponse.RegionEntityList.Length"); i++) {
			RegionEntity regionEntity = new RegionEntity();
			regionEntity.setId(context.stringValue("ListAliyunRegionResponse.RegionEntityList["+ i +"].Id"));
			regionEntity.setName(context.stringValue("ListAliyunRegionResponse.RegionEntityList["+ i +"].Name"));

			regionEntityList.add(regionEntity);
		}
		listAliyunRegionResponse.setRegionEntityList(regionEntityList);
	 
	 	return listAliyunRegionResponse;
	}
}