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

import com.aliyuncs.mts.model.v20140618.AddWaterMarkTemplateResponse;
import com.aliyuncs.mts.model.v20140618.AddWaterMarkTemplateResponse.WaterMarkTemplate;
import com.aliyuncs.mts.model.v20140618.AddWaterMarkTemplateResponse.WaterMarkTemplate.RatioRefer;
import com.aliyuncs.mts.model.v20140618.AddWaterMarkTemplateResponse.WaterMarkTemplate.Timeline;
import com.aliyuncs.transform.UnmarshallerContext;


public class AddWaterMarkTemplateResponseUnmarshaller {

	public static AddWaterMarkTemplateResponse unmarshall(AddWaterMarkTemplateResponse addWaterMarkTemplateResponse, UnmarshallerContext _ctx) {
		
		addWaterMarkTemplateResponse.setRequestId(_ctx.stringValue("AddWaterMarkTemplateResponse.RequestId"));

		WaterMarkTemplate waterMarkTemplate = new WaterMarkTemplate();
		waterMarkTemplate.setType(_ctx.stringValue("AddWaterMarkTemplateResponse.WaterMarkTemplate.Type"));
		waterMarkTemplate.setReferPos(_ctx.stringValue("AddWaterMarkTemplateResponse.WaterMarkTemplate.ReferPos"));
		waterMarkTemplate.setState(_ctx.stringValue("AddWaterMarkTemplateResponse.WaterMarkTemplate.State"));
		waterMarkTemplate.setDx(_ctx.stringValue("AddWaterMarkTemplateResponse.WaterMarkTemplate.Dx"));
		waterMarkTemplate.setWidth(_ctx.stringValue("AddWaterMarkTemplateResponse.WaterMarkTemplate.Width"));
		waterMarkTemplate.setHeight(_ctx.stringValue("AddWaterMarkTemplateResponse.WaterMarkTemplate.Height"));
		waterMarkTemplate.setName(_ctx.stringValue("AddWaterMarkTemplateResponse.WaterMarkTemplate.Name"));
		waterMarkTemplate.setDy(_ctx.stringValue("AddWaterMarkTemplateResponse.WaterMarkTemplate.Dy"));
		waterMarkTemplate.setId(_ctx.stringValue("AddWaterMarkTemplateResponse.WaterMarkTemplate.Id"));

		RatioRefer ratioRefer = new RatioRefer();
		ratioRefer.setDx(_ctx.stringValue("AddWaterMarkTemplateResponse.WaterMarkTemplate.RatioRefer.Dx"));
		ratioRefer.setWidth(_ctx.stringValue("AddWaterMarkTemplateResponse.WaterMarkTemplate.RatioRefer.Width"));
		ratioRefer.setHeight(_ctx.stringValue("AddWaterMarkTemplateResponse.WaterMarkTemplate.RatioRefer.Height"));
		ratioRefer.setDy(_ctx.stringValue("AddWaterMarkTemplateResponse.WaterMarkTemplate.RatioRefer.Dy"));
		waterMarkTemplate.setRatioRefer(ratioRefer);

		Timeline timeline = new Timeline();
		timeline.setStart(_ctx.stringValue("AddWaterMarkTemplateResponse.WaterMarkTemplate.Timeline.Start"));
		timeline.setDuration(_ctx.stringValue("AddWaterMarkTemplateResponse.WaterMarkTemplate.Timeline.Duration"));
		waterMarkTemplate.setTimeline(timeline);
		addWaterMarkTemplateResponse.setWaterMarkTemplate(waterMarkTemplate);
	 
	 	return addWaterMarkTemplateResponse;
	}
}