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

import com.aliyuncs.mts.model.v20140618.QueryWaterMarkTemplateListResponse;
import com.aliyuncs.mts.model.v20140618.QueryWaterMarkTemplateListResponse.WaterMarkTemplate;
import com.aliyuncs.mts.model.v20140618.QueryWaterMarkTemplateListResponse.WaterMarkTemplate.RatioRefer;
import com.aliyuncs.mts.model.v20140618.QueryWaterMarkTemplateListResponse.WaterMarkTemplate.Timeline;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryWaterMarkTemplateListResponseUnmarshaller {

	public static QueryWaterMarkTemplateListResponse unmarshall(QueryWaterMarkTemplateListResponse queryWaterMarkTemplateListResponse, UnmarshallerContext _ctx) {
		
		queryWaterMarkTemplateListResponse.setRequestId(_ctx.stringValue("QueryWaterMarkTemplateListResponse.RequestId"));

		List<String> nonExistWids = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("QueryWaterMarkTemplateListResponse.NonExistWids.Length"); i++) {
			nonExistWids.add(_ctx.stringValue("QueryWaterMarkTemplateListResponse.NonExistWids["+ i +"]"));
		}
		queryWaterMarkTemplateListResponse.setNonExistWids(nonExistWids);

		List<WaterMarkTemplate> waterMarkTemplateList = new ArrayList<WaterMarkTemplate>();
		for (int i = 0; i < _ctx.lengthValue("QueryWaterMarkTemplateListResponse.WaterMarkTemplateList.Length"); i++) {
			WaterMarkTemplate waterMarkTemplate = new WaterMarkTemplate();
			waterMarkTemplate.setId(_ctx.stringValue("QueryWaterMarkTemplateListResponse.WaterMarkTemplateList["+ i +"].Id"));
			waterMarkTemplate.setName(_ctx.stringValue("QueryWaterMarkTemplateListResponse.WaterMarkTemplateList["+ i +"].Name"));
			waterMarkTemplate.setWidth(_ctx.stringValue("QueryWaterMarkTemplateListResponse.WaterMarkTemplateList["+ i +"].Width"));
			waterMarkTemplate.setHeight(_ctx.stringValue("QueryWaterMarkTemplateListResponse.WaterMarkTemplateList["+ i +"].Height"));
			waterMarkTemplate.setDx(_ctx.stringValue("QueryWaterMarkTemplateListResponse.WaterMarkTemplateList["+ i +"].Dx"));
			waterMarkTemplate.setDy(_ctx.stringValue("QueryWaterMarkTemplateListResponse.WaterMarkTemplateList["+ i +"].Dy"));
			waterMarkTemplate.setReferPos(_ctx.stringValue("QueryWaterMarkTemplateListResponse.WaterMarkTemplateList["+ i +"].ReferPos"));
			waterMarkTemplate.setType(_ctx.stringValue("QueryWaterMarkTemplateListResponse.WaterMarkTemplateList["+ i +"].Type"));
			waterMarkTemplate.setState(_ctx.stringValue("QueryWaterMarkTemplateListResponse.WaterMarkTemplateList["+ i +"].State"));

			Timeline timeline = new Timeline();
			timeline.setStart(_ctx.stringValue("QueryWaterMarkTemplateListResponse.WaterMarkTemplateList["+ i +"].Timeline.Start"));
			timeline.setDuration(_ctx.stringValue("QueryWaterMarkTemplateListResponse.WaterMarkTemplateList["+ i +"].Timeline.Duration"));
			waterMarkTemplate.setTimeline(timeline);

			RatioRefer ratioRefer = new RatioRefer();
			ratioRefer.setDx(_ctx.stringValue("QueryWaterMarkTemplateListResponse.WaterMarkTemplateList["+ i +"].RatioRefer.Dx"));
			ratioRefer.setDy(_ctx.stringValue("QueryWaterMarkTemplateListResponse.WaterMarkTemplateList["+ i +"].RatioRefer.Dy"));
			ratioRefer.setWidth(_ctx.stringValue("QueryWaterMarkTemplateListResponse.WaterMarkTemplateList["+ i +"].RatioRefer.Width"));
			ratioRefer.setHeight(_ctx.stringValue("QueryWaterMarkTemplateListResponse.WaterMarkTemplateList["+ i +"].RatioRefer.Height"));
			waterMarkTemplate.setRatioRefer(ratioRefer);

			waterMarkTemplateList.add(waterMarkTemplate);
		}
		queryWaterMarkTemplateListResponse.setWaterMarkTemplateList(waterMarkTemplateList);
	 
	 	return queryWaterMarkTemplateListResponse;
	}
}