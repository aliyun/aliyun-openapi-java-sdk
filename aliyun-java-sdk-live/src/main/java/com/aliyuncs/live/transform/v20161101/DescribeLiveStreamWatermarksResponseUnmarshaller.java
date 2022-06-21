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

package com.aliyuncs.live.transform.v20161101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.live.model.v20161101.DescribeLiveStreamWatermarksResponse;
import com.aliyuncs.live.model.v20161101.DescribeLiveStreamWatermarksResponse.Watermark;
import com.aliyuncs.transform.UnmarshallerContext;


public class DescribeLiveStreamWatermarksResponseUnmarshaller {

	public static DescribeLiveStreamWatermarksResponse unmarshall(DescribeLiveStreamWatermarksResponse describeLiveStreamWatermarksResponse, UnmarshallerContext _ctx) {
		
		describeLiveStreamWatermarksResponse.setRequestId(_ctx.stringValue("DescribeLiveStreamWatermarksResponse.RequestId"));

		List<Watermark> watermarkList = new ArrayList<Watermark>();
		for (int i = 0; i < _ctx.lengthValue("DescribeLiveStreamWatermarksResponse.WatermarkList.Length"); i++) {
			Watermark watermark = new Watermark();
			watermark.setTemplateId(_ctx.stringValue("DescribeLiveStreamWatermarksResponse.WatermarkList["+ i +"].TemplateId"));
			watermark.setName(_ctx.stringValue("DescribeLiveStreamWatermarksResponse.WatermarkList["+ i +"].Name"));
			watermark.setType(_ctx.integerValue("DescribeLiveStreamWatermarksResponse.WatermarkList["+ i +"].Type"));
			watermark.setDescription(_ctx.stringValue("DescribeLiveStreamWatermarksResponse.WatermarkList["+ i +"].Description"));
			watermark.setRefWidth(_ctx.integerValue("DescribeLiveStreamWatermarksResponse.WatermarkList["+ i +"].RefWidth"));
			watermark.setRefHeight(_ctx.integerValue("DescribeLiveStreamWatermarksResponse.WatermarkList["+ i +"].RefHeight"));
			watermark.setXOffset(_ctx.floatValue("DescribeLiveStreamWatermarksResponse.WatermarkList["+ i +"].XOffset"));
			watermark.setYOffset(_ctx.floatValue("DescribeLiveStreamWatermarksResponse.WatermarkList["+ i +"].YOffset"));
			watermark.setHeight(_ctx.integerValue("DescribeLiveStreamWatermarksResponse.WatermarkList["+ i +"].Height"));
			watermark.setTransparency(_ctx.integerValue("DescribeLiveStreamWatermarksResponse.WatermarkList["+ i +"].Transparency"));
			watermark.setOffsetCorner(_ctx.stringValue("DescribeLiveStreamWatermarksResponse.WatermarkList["+ i +"].OffsetCorner"));
			watermark.setPictureUrl(_ctx.stringValue("DescribeLiveStreamWatermarksResponse.WatermarkList["+ i +"].PictureUrl"));

			watermarkList.add(watermark);
		}
		describeLiveStreamWatermarksResponse.setWatermarkList(watermarkList);
	 
	 	return describeLiveStreamWatermarksResponse;
	}
}