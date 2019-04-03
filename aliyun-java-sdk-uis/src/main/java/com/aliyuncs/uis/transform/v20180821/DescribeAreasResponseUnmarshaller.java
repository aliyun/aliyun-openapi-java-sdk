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

package com.aliyuncs.uis.transform.v20180821;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.uis.model.v20180821.DescribeAreasResponse;
import com.aliyuncs.uis.model.v20180821.DescribeAreasResponse.Area;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeAreasResponseUnmarshaller {

	public static DescribeAreasResponse unmarshall(DescribeAreasResponse describeAreasResponse, UnmarshallerContext context) {
		
		describeAreasResponse.setRequestId(context.stringValue("DescribeAreasResponse.RequestId"));

		List<Area> areas = new ArrayList<Area>();
		for (int i = 0; i < context.lengthValue("DescribeAreasResponse.Areas.Length"); i++) {
			Area area = new Area();
			area.setAreaId(context.stringValue("DescribeAreasResponse.Areas["+ i +"].AreaId"));
			area.setLocalName(context.stringValue("DescribeAreasResponse.Areas["+ i +"].LocalName"));

			areas.add(area);
		}
		describeAreasResponse.setAreas(areas);
	 
	 	return describeAreasResponse;
	}
}