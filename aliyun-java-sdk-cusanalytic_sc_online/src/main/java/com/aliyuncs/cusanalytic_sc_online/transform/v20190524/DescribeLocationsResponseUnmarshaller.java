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

package com.aliyuncs.cusanalytic_sc_online.transform.v20190524;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.cusanalytic_sc_online.model.v20190524.DescribeLocationsResponse;
import com.aliyuncs.cusanalytic_sc_online.model.v20190524.DescribeLocationsResponse.LocationMsgItem;
import com.aliyuncs.cusanalytic_sc_online.model.v20190524.DescribeLocationsResponse.LocationMsgItem.RectRoi;
import com.aliyuncs.cusanalytic_sc_online.model.v20190524.DescribeLocationsResponse.LocationMsgItem.RectRoi.Point;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLocationsResponseUnmarshaller {

	public static DescribeLocationsResponse unmarshall(DescribeLocationsResponse describeLocationsResponse, UnmarshallerContext _ctx) {
		
		describeLocationsResponse.setStoreId(_ctx.stringValue("DescribeLocationsResponse.StoreId"));

		List<LocationMsgItem> locationMsgItems = new ArrayList<LocationMsgItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLocationsResponse.LocationMsgItems.Length"); i++) {
			LocationMsgItem locationMsgItem = new LocationMsgItem();
			locationMsgItem.setTag(_ctx.stringValue("DescribeLocationsResponse.LocationMsgItems["+ i +"].Tag"));
			locationMsgItem.setId(_ctx.longValue("DescribeLocationsResponse.LocationMsgItems["+ i +"].Id"));
			locationMsgItem.setExtId(_ctx.stringValue("DescribeLocationsResponse.LocationMsgItems["+ i +"].ExtId"));
			locationMsgItem.setLocationType(_ctx.stringValue("DescribeLocationsResponse.LocationMsgItems["+ i +"].LocationType"));
			locationMsgItem.setName(_ctx.stringValue("DescribeLocationsResponse.LocationMsgItems["+ i +"].Name"));
			locationMsgItem.setStatus(_ctx.longValue("DescribeLocationsResponse.LocationMsgItems["+ i +"].Status"));
			locationMsgItem.setGmtCreate(_ctx.stringValue("DescribeLocationsResponse.LocationMsgItems["+ i +"].GmtCreate"));
			locationMsgItem.setStoreId(_ctx.longValue("DescribeLocationsResponse.LocationMsgItems["+ i +"].StoreId"));
			locationMsgItem.setGmtModified(_ctx.stringValue("DescribeLocationsResponse.LocationMsgItems["+ i +"].GmtModified"));
			locationMsgItem.setParentLocationId(_ctx.longValue("DescribeLocationsResponse.LocationMsgItems["+ i +"].ParentLocationId"));
			locationMsgItem.setLayerType(_ctx.stringValue("DescribeLocationsResponse.LocationMsgItems["+ i +"].LayerType"));

			List<RectRoi> rectRois = new ArrayList<RectRoi>();
			for (int j = 0; j < _ctx.lengthValue("DescribeLocationsResponse.LocationMsgItems["+ i +"].RectRois.Length"); j++) {
				RectRoi rectRoi = new RectRoi();

				List<Point> points = new ArrayList<Point>();
				for (int k = 0; k < _ctx.lengthValue("DescribeLocationsResponse.LocationMsgItems["+ i +"].RectRois["+ j +"].Points.Length"); k++) {
					Point point = new Point();
					point.setX(_ctx.floatValue("DescribeLocationsResponse.LocationMsgItems["+ i +"].RectRois["+ j +"].Points["+ k +"].X"));
					point.setY(_ctx.floatValue("DescribeLocationsResponse.LocationMsgItems["+ i +"].RectRois["+ j +"].Points["+ k +"].Y"));

					points.add(point);
				}
				rectRoi.setPoints(points);

				rectRois.add(rectRoi);
			}
			locationMsgItem.setRectRois(rectRois);

			locationMsgItems.add(locationMsgItem);
		}
		describeLocationsResponse.setLocationMsgItems(locationMsgItems);
	 
	 	return describeLocationsResponse;
	}
}