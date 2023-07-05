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

package com.aliyuncs.advisor_share.transform.v20180608;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.advisor_share.model.v20180608.ListCostTrendResponse;
import com.aliyuncs.advisor_share.model.v20180608.ListCostTrendResponse.Data;
import com.aliyuncs.advisor_share.model.v20180608.ListCostTrendResponse.Data.LineVOListItem;
import com.aliyuncs.advisor_share.model.v20180608.ListCostTrendResponse.Data.LineVOListItem.PointVOListItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListCostTrendResponseUnmarshaller {

	public static ListCostTrendResponse unmarshall(ListCostTrendResponse listCostTrendResponse, UnmarshallerContext _ctx) {
		
		listCostTrendResponse.setSuccess(_ctx.booleanValue("ListCostTrendResponse.Success"));

		Data data = new Data();
		data.setGraphName(_ctx.stringValue("ListCostTrendResponse.Data.GraphName"));
		data.setXUnit(_ctx.stringValue("ListCostTrendResponse.Data.XUnit"));
		data.setYUnit(_ctx.stringValue("ListCostTrendResponse.Data.YUnit"));

		List<LineVOListItem> lineVOList = new ArrayList<LineVOListItem>();
		for (int i = 0; i < _ctx.lengthValue("ListCostTrendResponse.Data.LineVOList.Length"); i++) {
			LineVOListItem lineVOListItem = new LineVOListItem();
			lineVOListItem.setName(_ctx.stringValue("ListCostTrendResponse.Data.LineVOList["+ i +"].Name"));

			List<PointVOListItem> pointVOList = new ArrayList<PointVOListItem>();
			for (int j = 0; j < _ctx.lengthValue("ListCostTrendResponse.Data.LineVOList["+ i +"].PointVOList.Length"); j++) {
				PointVOListItem pointVOListItem = new PointVOListItem();
				pointVOListItem.setX(_ctx.stringValue("ListCostTrendResponse.Data.LineVOList["+ i +"].PointVOList["+ j +"].X"));
				pointVOListItem.setY(_ctx.stringValue("ListCostTrendResponse.Data.LineVOList["+ i +"].PointVOList["+ j +"].Y"));

				pointVOList.add(pointVOListItem);
			}
			lineVOListItem.setPointVOList(pointVOList);

			lineVOList.add(lineVOListItem);
		}
		data.setLineVOList(lineVOList);
		listCostTrendResponse.setData(data);
	 
	 	return listCostTrendResponse;
	}
}