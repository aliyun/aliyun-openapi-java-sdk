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

import com.aliyuncs.cusanalytic_sc_online.model.v20190524.DescribeActionDataResponse;
import com.aliyuncs.cusanalytic_sc_online.model.v20190524.DescribeActionDataResponse.ActionsMsgItem;
import com.aliyuncs.cusanalytic_sc_online.model.v20190524.DescribeActionDataResponse.ActionsMsgItem.ActionInfosItem;
import com.aliyuncs.cusanalytic_sc_online.model.v20190524.DescribeActionDataResponse.ActionsMsgItem.ActionInfosItem.FaceImgRect;
import com.aliyuncs.cusanalytic_sc_online.model.v20190524.DescribeActionDataResponse.ActionsMsgItem.ActionInfosItem.MapImagePoint;
import com.aliyuncs.cusanalytic_sc_online.model.v20190524.DescribeActionDataResponse.ActionsMsgItem.AttributesMsgItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeActionDataResponseUnmarshaller {

	public static DescribeActionDataResponse unmarshall(DescribeActionDataResponse describeActionDataResponse, UnmarshallerContext _ctx) {
		
		describeActionDataResponse.setPageNo(_ctx.integerValue("DescribeActionDataResponse.PageNo"));
		describeActionDataResponse.setTsStart(_ctx.longValue("DescribeActionDataResponse.TsStart"));
		describeActionDataResponse.setPageLimit(_ctx.integerValue("DescribeActionDataResponse.PageLimit"));
		describeActionDataResponse.setPageCount(_ctx.integerValue("DescribeActionDataResponse.PageCount"));
		describeActionDataResponse.setIsSuccess(_ctx.booleanValue("DescribeActionDataResponse.IsSuccess"));
		describeActionDataResponse.setErrorMsg(_ctx.stringValue("DescribeActionDataResponse.ErrorMsg"));
		describeActionDataResponse.setStoreId(_ctx.stringValue("DescribeActionDataResponse.StoreId"));
		describeActionDataResponse.setTsEnd(_ctx.longValue("DescribeActionDataResponse.TsEnd"));

		List<ActionsMsgItem> actionsMsgItems = new ArrayList<ActionsMsgItem>();
		for (int i = 0; i < _ctx.lengthValue("DescribeActionDataResponse.ActionsMsgItems.Length"); i++) {
			ActionsMsgItem actionsMsgItem = new ActionsMsgItem();
			actionsMsgItem.setLocationId(_ctx.longValue("DescribeActionDataResponse.ActionsMsgItems["+ i +"].LocationId"));
			actionsMsgItem.setUkId(_ctx.longValue("DescribeActionDataResponse.ActionsMsgItems["+ i +"].UkId"));
			actionsMsgItem.setGmtModified(_ctx.stringValue("DescribeActionDataResponse.ActionsMsgItems["+ i +"].GmtModified"));
			actionsMsgItem.setStatus(_ctx.longValue("DescribeActionDataResponse.ActionsMsgItems["+ i +"].Status"));
			actionsMsgItem.setGmtCreate(_ctx.stringValue("DescribeActionDataResponse.ActionsMsgItems["+ i +"].GmtCreate"));
			actionsMsgItem.setStoreId(_ctx.longValue("DescribeActionDataResponse.ActionsMsgItems["+ i +"].StoreId"));
			actionsMsgItem.setTag(_ctx.stringValue("DescribeActionDataResponse.ActionsMsgItems["+ i +"].Tag"));
			actionsMsgItem.setId(_ctx.longValue("DescribeActionDataResponse.ActionsMsgItems["+ i +"].Id"));
			actionsMsgItem.setLocationLayerType(_ctx.stringValue("DescribeActionDataResponse.ActionsMsgItems["+ i +"].LocationLayerType"));

			ActionInfosItem actionInfosItem = new ActionInfosItem();
			actionInfosItem.setMaxts(_ctx.longValue("DescribeActionDataResponse.ActionsMsgItems["+ i +"].ActionInfosItem.Maxts"));
			actionInfosItem.setStayValid(_ctx.longValue("DescribeActionDataResponse.ActionsMsgItems["+ i +"].ActionInfosItem.StayValid"));
			actionInfosItem.setStayPeriod(_ctx.longValue("DescribeActionDataResponse.ActionsMsgItems["+ i +"].ActionInfosItem.StayPeriod"));
			actionInfosItem.setRawId(_ctx.longValue("DescribeActionDataResponse.ActionsMsgItems["+ i +"].ActionInfosItem.RawId"));
			actionInfosItem.setMints(_ctx.longValue("DescribeActionDataResponse.ActionsMsgItems["+ i +"].ActionInfosItem.Mints"));

			MapImagePoint mapImagePoint = new MapImagePoint();
			mapImagePoint.setX(_ctx.floatValue("DescribeActionDataResponse.ActionsMsgItems["+ i +"].ActionInfosItem.MapImagePoint.X"));
			mapImagePoint.setY(_ctx.floatValue("DescribeActionDataResponse.ActionsMsgItems["+ i +"].ActionInfosItem.MapImagePoint.Y"));
			actionInfosItem.setMapImagePoint(mapImagePoint);

			FaceImgRect faceImgRect = new FaceImgRect();
			faceImgRect.setBottom(_ctx.floatValue("DescribeActionDataResponse.ActionsMsgItems["+ i +"].ActionInfosItem.FaceImgRect.Bottom"));
			faceImgRect.setLeft(_ctx.floatValue("DescribeActionDataResponse.ActionsMsgItems["+ i +"].ActionInfosItem.FaceImgRect.Left"));
			faceImgRect.setTop(_ctx.floatValue("DescribeActionDataResponse.ActionsMsgItems["+ i +"].ActionInfosItem.FaceImgRect.Top"));
			faceImgRect.setRight(_ctx.floatValue("DescribeActionDataResponse.ActionsMsgItems["+ i +"].ActionInfosItem.FaceImgRect.Right"));
			actionInfosItem.setFaceImgRect(faceImgRect);
			actionsMsgItem.setActionInfosItem(actionInfosItem);

			AttributesMsgItem attributesMsgItem = new AttributesMsgItem();
			attributesMsgItem.setImgUrl(_ctx.stringValue("DescribeActionDataResponse.ActionsMsgItems["+ i +"].AttributesMsgItem.ImgUrl"));
			attributesMsgItem.setScore(_ctx.longValue("DescribeActionDataResponse.ActionsMsgItems["+ i +"].AttributesMsgItem.Score"));
			attributesMsgItem.setGender(_ctx.stringValue("DescribeActionDataResponse.ActionsMsgItems["+ i +"].AttributesMsgItem.Gender"));
			attributesMsgItem.setIsClerk(_ctx.longValue("DescribeActionDataResponse.ActionsMsgItems["+ i +"].AttributesMsgItem.IsClerk"));
			attributesMsgItem.setAgeNum(_ctx.integerValue("DescribeActionDataResponse.ActionsMsgItems["+ i +"].AttributesMsgItem.AgeNum"));
			attributesMsgItem.setImgObjectKey(_ctx.stringValue("DescribeActionDataResponse.ActionsMsgItems["+ i +"].AttributesMsgItem.ImgObjectKey"));
			attributesMsgItem.setImgType(_ctx.stringValue("DescribeActionDataResponse.ActionsMsgItems["+ i +"].AttributesMsgItem.ImgType"));
			actionsMsgItem.setAttributesMsgItem(attributesMsgItem);

			actionsMsgItems.add(actionsMsgItem);
		}
		describeActionDataResponse.setActionsMsgItems(actionsMsgItems);
	 
	 	return describeActionDataResponse;
	}
}