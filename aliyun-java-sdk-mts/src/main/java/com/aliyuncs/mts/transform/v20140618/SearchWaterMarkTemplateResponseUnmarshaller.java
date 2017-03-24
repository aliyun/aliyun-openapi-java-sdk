/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
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

	public static SearchWaterMarkTemplateResponse unmarshall(SearchWaterMarkTemplateResponse searchWaterMarkTemplateResponse, UnmarshallerContext context) {
		
		searchWaterMarkTemplateResponse.setRequestId(context.stringValue("SearchWaterMarkTemplateResponse.RequestId"));
		searchWaterMarkTemplateResponse.setTotalCount(context.longValue("SearchWaterMarkTemplateResponse.TotalCount"));
		searchWaterMarkTemplateResponse.setPageNumber(context.longValue("SearchWaterMarkTemplateResponse.PageNumber"));
		searchWaterMarkTemplateResponse.setPageSize(context.longValue("SearchWaterMarkTemplateResponse.PageSize"));

		List<WaterMarkTemplate> waterMarkTemplateList = new ArrayList<WaterMarkTemplate>();
		for (int i = 0; i < context.lengthValue("SearchWaterMarkTemplateResponse.WaterMarkTemplateList.Length"); i++) {
			WaterMarkTemplate waterMarkTemplate = new WaterMarkTemplate();
			waterMarkTemplate.setId(context.stringValue("SearchWaterMarkTemplateResponse.WaterMarkTemplateList["+ i +"].Id"));
			waterMarkTemplate.setName(context.stringValue("SearchWaterMarkTemplateResponse.WaterMarkTemplateList["+ i +"].Name"));
			waterMarkTemplate.setWidth(context.stringValue("SearchWaterMarkTemplateResponse.WaterMarkTemplateList["+ i +"].Width"));
			waterMarkTemplate.setHeight(context.stringValue("SearchWaterMarkTemplateResponse.WaterMarkTemplateList["+ i +"].Height"));
			waterMarkTemplate.setDx(context.stringValue("SearchWaterMarkTemplateResponse.WaterMarkTemplateList["+ i +"].Dx"));
			waterMarkTemplate.setDy(context.stringValue("SearchWaterMarkTemplateResponse.WaterMarkTemplateList["+ i +"].Dy"));
			waterMarkTemplate.setReferPos(context.stringValue("SearchWaterMarkTemplateResponse.WaterMarkTemplateList["+ i +"].ReferPos"));
			waterMarkTemplate.setType(context.stringValue("SearchWaterMarkTemplateResponse.WaterMarkTemplateList["+ i +"].Type"));
			waterMarkTemplate.setState(context.stringValue("SearchWaterMarkTemplateResponse.WaterMarkTemplateList["+ i +"].State"));

			Timeline timeline = new Timeline();
			timeline.setStart(context.stringValue("SearchWaterMarkTemplateResponse.WaterMarkTemplateList["+ i +"].Timeline.Start"));
			timeline.setDuration(context.stringValue("SearchWaterMarkTemplateResponse.WaterMarkTemplateList["+ i +"].Timeline.Duration"));
			waterMarkTemplate.setTimeline(timeline);

			RatioRefer ratioRefer = new RatioRefer();
			ratioRefer.setDx(context.stringValue("SearchWaterMarkTemplateResponse.WaterMarkTemplateList["+ i +"].RatioRefer.Dx"));
			ratioRefer.setDy(context.stringValue("SearchWaterMarkTemplateResponse.WaterMarkTemplateList["+ i +"].RatioRefer.Dy"));
			ratioRefer.setWidth(context.stringValue("SearchWaterMarkTemplateResponse.WaterMarkTemplateList["+ i +"].RatioRefer.Width"));
			ratioRefer.setHeight(context.stringValue("SearchWaterMarkTemplateResponse.WaterMarkTemplateList["+ i +"].RatioRefer.Height"));
			waterMarkTemplate.setRatioRefer(ratioRefer);

			waterMarkTemplateList.add(waterMarkTemplate);
		}
		searchWaterMarkTemplateResponse.setWaterMarkTemplateList(waterMarkTemplateList);
	 
	 	return searchWaterMarkTemplateResponse;
	}
}