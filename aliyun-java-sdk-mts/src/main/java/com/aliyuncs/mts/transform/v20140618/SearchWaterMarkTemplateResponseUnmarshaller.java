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

package com.aliyuncs.mts.transform.v20140618;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mts.model.v20140618.SearchWaterMarkTemplateResponse;
import com.aliyuncs.mts.model.v20140618.SearchWaterMarkTemplateResponse.WaterMarkTemplate;
import com.aliyuncs.mts.model.v20140618.SearchWaterMarkTemplateResponse.WaterMarkTemplate.RatioRefer;
import com.aliyuncs.mts.model.v20140618.SearchWaterMarkTemplateResponse.WaterMarkTemplate.Timeline;
import com.aliyuncs.transform.UnmarshallerContext;


public class SearchWaterMarkTemplateResponseUnmarshaller {

	public static SearchWaterMarkTemplateResponse unmarshall(SearchWaterMarkTemplateResponse searchWaterMarkTemplateResponse, UnmarshallerContext _ctx) {
		
		searchWaterMarkTemplateResponse.setRequestId(_ctx.stringValue("SearchWaterMarkTemplateResponse.RequestId"));
		searchWaterMarkTemplateResponse.setTotalCount(_ctx.longValue("SearchWaterMarkTemplateResponse.TotalCount"));
		searchWaterMarkTemplateResponse.setPageNumber(_ctx.longValue("SearchWaterMarkTemplateResponse.PageNumber"));
		searchWaterMarkTemplateResponse.setPageSize(_ctx.longValue("SearchWaterMarkTemplateResponse.PageSize"));

		List<WaterMarkTemplate> waterMarkTemplateList = new ArrayList<WaterMarkTemplate>();
		for (int i = 0; i < _ctx.lengthValue("SearchWaterMarkTemplateResponse.WaterMarkTemplateList.Length"); i++) {
			WaterMarkTemplate waterMarkTemplate = new WaterMarkTemplate();
			waterMarkTemplate.setId(_ctx.stringValue("SearchWaterMarkTemplateResponse.WaterMarkTemplateList["+ i +"].Id"));
			waterMarkTemplate.setName(_ctx.stringValue("SearchWaterMarkTemplateResponse.WaterMarkTemplateList["+ i +"].Name"));
			waterMarkTemplate.setWidth(_ctx.stringValue("SearchWaterMarkTemplateResponse.WaterMarkTemplateList["+ i +"].Width"));
			waterMarkTemplate.setHeight(_ctx.stringValue("SearchWaterMarkTemplateResponse.WaterMarkTemplateList["+ i +"].Height"));
			waterMarkTemplate.setDx(_ctx.stringValue("SearchWaterMarkTemplateResponse.WaterMarkTemplateList["+ i +"].Dx"));
			waterMarkTemplate.setDy(_ctx.stringValue("SearchWaterMarkTemplateResponse.WaterMarkTemplateList["+ i +"].Dy"));
			waterMarkTemplate.setReferPos(_ctx.stringValue("SearchWaterMarkTemplateResponse.WaterMarkTemplateList["+ i +"].ReferPos"));
			waterMarkTemplate.setType(_ctx.stringValue("SearchWaterMarkTemplateResponse.WaterMarkTemplateList["+ i +"].Type"));
			waterMarkTemplate.setState(_ctx.stringValue("SearchWaterMarkTemplateResponse.WaterMarkTemplateList["+ i +"].State"));

			Timeline timeline = new Timeline();
			timeline.setStart(_ctx.stringValue("SearchWaterMarkTemplateResponse.WaterMarkTemplateList["+ i +"].Timeline.Start"));
			timeline.setDuration(_ctx.stringValue("SearchWaterMarkTemplateResponse.WaterMarkTemplateList["+ i +"].Timeline.Duration"));
			waterMarkTemplate.setTimeline(timeline);

			RatioRefer ratioRefer = new RatioRefer();
			ratioRefer.setDx(_ctx.stringValue("SearchWaterMarkTemplateResponse.WaterMarkTemplateList["+ i +"].RatioRefer.Dx"));
			ratioRefer.setDy(_ctx.stringValue("SearchWaterMarkTemplateResponse.WaterMarkTemplateList["+ i +"].RatioRefer.Dy"));
			ratioRefer.setWidth(_ctx.stringValue("SearchWaterMarkTemplateResponse.WaterMarkTemplateList["+ i +"].RatioRefer.Width"));
			ratioRefer.setHeight(_ctx.stringValue("SearchWaterMarkTemplateResponse.WaterMarkTemplateList["+ i +"].RatioRefer.Height"));
			waterMarkTemplate.setRatioRefer(ratioRefer);

			waterMarkTemplateList.add(waterMarkTemplate);
		}
		searchWaterMarkTemplateResponse.setWaterMarkTemplateList(waterMarkTemplateList);
	 
	 	return searchWaterMarkTemplateResponse;
	}
}