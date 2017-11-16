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

import com.aliyuncs.mts.model.v20140618.AddWaterMarkTemplateResponse;
import com.aliyuncs.mts.model.v20140618.AddWaterMarkTemplateResponse.WaterMarkTemplate;
import com.aliyuncs.mts.model.v20140618.AddWaterMarkTemplateResponse.WaterMarkTemplate.RatioRefer;
import com.aliyuncs.mts.model.v20140618.AddWaterMarkTemplateResponse.WaterMarkTemplate.Timeline;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddWaterMarkTemplateResponseUnmarshaller {

	public static AddWaterMarkTemplateResponse unmarshall(AddWaterMarkTemplateResponse addWaterMarkTemplateResponse, UnmarshallerContext context) {
		
		addWaterMarkTemplateResponse.setRequestId(context.stringValue("AddWaterMarkTemplateResponse.RequestId"));

		WaterMarkTemplate waterMarkTemplate = new WaterMarkTemplate();
		waterMarkTemplate.setId(context.stringValue("AddWaterMarkTemplateResponse.WaterMarkTemplate.Id"));
		waterMarkTemplate.setName(context.stringValue("AddWaterMarkTemplateResponse.WaterMarkTemplate.Name"));
		waterMarkTemplate.setWidth(context.stringValue("AddWaterMarkTemplateResponse.WaterMarkTemplate.Width"));
		waterMarkTemplate.setHeight(context.stringValue("AddWaterMarkTemplateResponse.WaterMarkTemplate.Height"));
		waterMarkTemplate.setDx(context.stringValue("AddWaterMarkTemplateResponse.WaterMarkTemplate.Dx"));
		waterMarkTemplate.setDy(context.stringValue("AddWaterMarkTemplateResponse.WaterMarkTemplate.Dy"));
		waterMarkTemplate.setReferPos(context.stringValue("AddWaterMarkTemplateResponse.WaterMarkTemplate.ReferPos"));
		waterMarkTemplate.setType(context.stringValue("AddWaterMarkTemplateResponse.WaterMarkTemplate.Type"));
		waterMarkTemplate.setState(context.stringValue("AddWaterMarkTemplateResponse.WaterMarkTemplate.State"));

		Timeline timeline = new Timeline();
		timeline.setStart(context.stringValue("AddWaterMarkTemplateResponse.WaterMarkTemplate.Timeline.Start"));
		timeline.setDuration(context.stringValue("AddWaterMarkTemplateResponse.WaterMarkTemplate.Timeline.Duration"));
		waterMarkTemplate.setTimeline(timeline);

		RatioRefer ratioRefer = new RatioRefer();
		ratioRefer.setDx(context.stringValue("AddWaterMarkTemplateResponse.WaterMarkTemplate.RatioRefer.Dx"));
		ratioRefer.setDy(context.stringValue("AddWaterMarkTemplateResponse.WaterMarkTemplate.RatioRefer.Dy"));
		ratioRefer.setWidth(context.stringValue("AddWaterMarkTemplateResponse.WaterMarkTemplate.RatioRefer.Width"));
		ratioRefer.setHeight(context.stringValue("AddWaterMarkTemplateResponse.WaterMarkTemplate.RatioRefer.Height"));
		waterMarkTemplate.setRatioRefer(ratioRefer);
		addWaterMarkTemplateResponse.setWaterMarkTemplate(waterMarkTemplate);
	 
	 	return addWaterMarkTemplateResponse;
	}
}