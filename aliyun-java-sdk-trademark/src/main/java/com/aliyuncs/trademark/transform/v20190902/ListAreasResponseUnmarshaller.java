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

import com.aliyuncs.trademark.model.v20190902.ListAreasResponse;
import com.aliyuncs.trademark.model.v20190902.ListAreasResponse.Area;
import com.aliyuncs.trademark.model.v20190902.ListAreasResponse.Area.Area1;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListAreasResponseUnmarshaller {

	public static ListAreasResponse unmarshall(ListAreasResponse listAreasResponse, UnmarshallerContext _ctx) {
		
		listAreasResponse.setRequestId(_ctx.stringValue("ListAreasResponse.RequestId"));

		List<Area> datas = new ArrayList<Area>();
		for (int i = 0; i < _ctx.lengthValue("ListAreasResponse.Datas.Length"); i++) {
			Area area = new Area();
			area.setCode(_ctx.stringValue("ListAreasResponse.Datas["+ i +"].Code"));
			area.setParentCode(_ctx.stringValue("ListAreasResponse.Datas["+ i +"].ParentCode"));
			area.setName(_ctx.stringValue("ListAreasResponse.Datas["+ i +"].Name"));
			area.setSortNum(_ctx.integerValue("ListAreasResponse.Datas["+ i +"].SortNum"));

			List<Area1> subArea = new ArrayList<Area1>();
			for (int j = 0; j < _ctx.lengthValue("ListAreasResponse.Datas["+ i +"].SubArea.Length"); j++) {
				Area1 area1 = new Area1();
				area1.setCode(_ctx.stringValue("ListAreasResponse.Datas["+ i +"].SubArea["+ j +"].Code"));
				area1.setParentCode(_ctx.stringValue("ListAreasResponse.Datas["+ i +"].SubArea["+ j +"].ParentCode"));
				area1.setName(_ctx.stringValue("ListAreasResponse.Datas["+ i +"].SubArea["+ j +"].Name"));
				area1.setSortNum(_ctx.integerValue("ListAreasResponse.Datas["+ i +"].SubArea["+ j +"].SortNum"));

				subArea.add(area1);
			}
			area.setSubArea(subArea);

			datas.add(area);
		}
		listAreasResponse.setDatas(datas);
	 
	 	return listAreasResponse;
	}
}