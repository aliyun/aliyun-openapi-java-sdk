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

package com.aliyuncs.trademark.transform.v20190902;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20190902.QueryActivityItemsResponse;
import com.aliyuncs.trademark.model.v20190902.QueryActivityItemsResponse.Module;
import com.aliyuncs.trademark.model.v20190902.QueryActivityItemsResponse.Module.Floor;
import com.aliyuncs.trademark.model.v20190902.QueryActivityItemsResponse.Module.Floor.SubFloor;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryActivityItemsResponseUnmarshaller {

	public static QueryActivityItemsResponse unmarshall(QueryActivityItemsResponse queryActivityItemsResponse, UnmarshallerContext _ctx) {
		

		Module module = new Module();
		module.setData(_ctx.stringValue("QueryActivityItemsResponse.Module.Data"));
		module.setFloorItems(_ctx.stringValue("QueryActivityItemsResponse.Module.FloorItems"));

		List<Floor> floorDisplayInfos = new ArrayList<Floor>();
		for (int i = 0; i < _ctx.lengthValue("QueryActivityItemsResponse.Module.FloorDisplayInfos.Length"); i++) {
			Floor floor = new Floor();
			floor.setName(_ctx.stringValue("QueryActivityItemsResponse.Module.FloorDisplayInfos["+ i +"].Name"));
			floor.setTitle(_ctx.stringValue("QueryActivityItemsResponse.Module.FloorDisplayInfos["+ i +"].Title"));
			floor.setIndex(_ctx.integerValue("QueryActivityItemsResponse.Module.FloorDisplayInfos["+ i +"].Index"));
			floor.setIcon(_ctx.stringValue("QueryActivityItemsResponse.Module.FloorDisplayInfos["+ i +"].Icon"));

			List<SubFloor> subTitles = new ArrayList<SubFloor>();
			for (int j = 0; j < _ctx.lengthValue("QueryActivityItemsResponse.Module.FloorDisplayInfos["+ i +"].SubTitles.Length"); j++) {
				SubFloor subFloor = new SubFloor();
				subFloor.setName(_ctx.stringValue("QueryActivityItemsResponse.Module.FloorDisplayInfos["+ i +"].SubTitles["+ j +"].Name"));
				subFloor.setTitle(_ctx.stringValue("QueryActivityItemsResponse.Module.FloorDisplayInfos["+ i +"].SubTitles["+ j +"].Title"));
				subFloor.setValue(_ctx.stringValue("QueryActivityItemsResponse.Module.FloorDisplayInfos["+ i +"].SubTitles["+ j +"].Value"));
				subFloor.setIcon(_ctx.stringValue("QueryActivityItemsResponse.Module.FloorDisplayInfos["+ i +"].SubTitles["+ j +"].Icon"));

				subTitles.add(subFloor);
			}
			floor.setSubTitles(subTitles);

			floorDisplayInfos.add(floor);
		}
		module.setFloorDisplayInfos(floorDisplayInfos);
		queryActivityItemsResponse.setModule(module);
	 
	 	return queryActivityItemsResponse;
	}
}