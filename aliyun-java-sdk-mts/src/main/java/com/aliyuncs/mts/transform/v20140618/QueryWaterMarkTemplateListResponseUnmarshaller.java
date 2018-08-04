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
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class QueryWaterMarkTemplateListResponseUnmarshaller {

	public static QueryWaterMarkTemplateListResponse unmarshall(QueryWaterMarkTemplateListResponse queryWaterMarkTemplateListResponse, UnmarshallerContext context) {
		
		queryWaterMarkTemplateListResponse.setRequestId(context.stringValue("QueryWaterMarkTemplateListResponse.RequestId"));

		List<String> nonExistWids = new ArrayList<String>();
		for (int i = 0; i < context.lengthValue("QueryWaterMarkTemplateListResponse.NonExistWids.Length"); i++) {
			nonExistWids.add(context.stringValue("QueryWaterMarkTemplateListResponse.NonExistWids["+ i +"]"));
		}
		queryWaterMarkTemplateListResponse.setNonExistWids(nonExistWids);

		List<WaterMarkTemplate> waterMarkTemplateList = new ArrayList<WaterMarkTemplate>();
		for (int i = 0; i < context.lengthValue("QueryWaterMarkTemplateListResponse.WaterMarkTemplateList.Length"); i++) {
			WaterMarkTemplate waterMarkTemplate = new WaterMarkTemplate();
			waterMarkTemplate.setId(context.stringValue("QueryWaterMarkTemplateListResponse.WaterMarkTemplateList["+ i +"].Id"));
			waterMarkTemplate.setName(context.stringValue("QueryWaterMarkTemplateListResponse.WaterMarkTemplateList["+ i +"].Name"));
			waterMarkTemplate.setWidth(context.stringValue("QueryWaterMarkTemplateListResponse.WaterMarkTemplateList["+ i +"].Width"));
			waterMarkTemplate.setHeight(context.stringValue("QueryWaterMarkTemplateListResponse.WaterMarkTemplateList["+ i +"].Height"));
			waterMarkTemplate.setDx(context.stringValue("QueryWaterMarkTemplateListResponse.WaterMarkTemplateList["+ i +"].Dx"));
			waterMarkTemplate.setDy(context.stringValue("QueryWaterMarkTemplateListResponse.WaterMarkTemplateList["+ i +"].Dy"));
			waterMarkTemplate.setReferPos(context.stringValue("QueryWaterMarkTemplateListResponse.WaterMarkTemplateList["+ i +"].ReferPos"));
			waterMarkTemplate.setType(context.stringValue("QueryWaterMarkTemplateListResponse.WaterMarkTemplateList["+ i +"].Type"));
			waterMarkTemplate.setState(context.stringValue("QueryWaterMarkTemplateListResponse.WaterMarkTemplateList["+ i +"].State"));

			Timeline timeline = new Timeline();
			timeline.setStart(context.stringValue("QueryWaterMarkTemplateListResponse.WaterMarkTemplateList["+ i +"].Timeline.Start"));
			timeline.setDuration(context.stringValue("QueryWaterMarkTemplateListResponse.WaterMarkTemplateList["+ i +"].Timeline.Duration"));
			waterMarkTemplate.setTimeline(timeline);

			RatioRefer ratioRefer = new RatioRefer();
			ratioRefer.setDx(context.stringValue("QueryWaterMarkTemplateListResponse.WaterMarkTemplateList["+ i +"].RatioRefer.Dx"));
			ratioRefer.setDy(context.stringValue("QueryWaterMarkTemplateListResponse.WaterMarkTemplateList["+ i +"].RatioRefer.Dy"));
			ratioRefer.setWidth(context.stringValue("QueryWaterMarkTemplateListResponse.WaterMarkTemplateList["+ i +"].RatioRefer.Width"));
			ratioRefer.setHeight(context.stringValue("QueryWaterMarkTemplateListResponse.WaterMarkTemplateList["+ i +"].RatioRefer.Height"));
			waterMarkTemplate.setRatioRefer(ratioRefer);

			waterMarkTemplateList.add(waterMarkTemplate);
		}
		queryWaterMarkTemplateListResponse.setWaterMarkTemplateList(waterMarkTemplateList);
	 
	 	return queryWaterMarkTemplateListResponse;
	}
}