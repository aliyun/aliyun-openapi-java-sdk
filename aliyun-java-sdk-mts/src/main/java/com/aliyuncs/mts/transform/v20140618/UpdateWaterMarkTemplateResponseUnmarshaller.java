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

import com.aliyuncs.mts.model.v20140618.UpdateWaterMarkTemplateResponse;
import com.aliyuncs.mts.model.v20140618.UpdateWaterMarkTemplateResponse.WaterMarkTemplate;
import com.aliyuncs.mts.model.v20140618.UpdateWaterMarkTemplateResponse.WaterMarkTemplate.RatioRefer;
import com.aliyuncs.mts.model.v20140618.UpdateWaterMarkTemplateResponse.WaterMarkTemplate.Timeline;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateWaterMarkTemplateResponseUnmarshaller {

	public static UpdateWaterMarkTemplateResponse unmarshall(UpdateWaterMarkTemplateResponse updateWaterMarkTemplateResponse, UnmarshallerContext _ctx) {
		
		updateWaterMarkTemplateResponse.setRequestId(_ctx.stringValue("UpdateWaterMarkTemplateResponse.RequestId"));

		WaterMarkTemplate waterMarkTemplate = new WaterMarkTemplate();
		waterMarkTemplate.setType(_ctx.stringValue("UpdateWaterMarkTemplateResponse.WaterMarkTemplate.Type"));
		waterMarkTemplate.setReferPos(_ctx.stringValue("UpdateWaterMarkTemplateResponse.WaterMarkTemplate.ReferPos"));
		waterMarkTemplate.setState(_ctx.stringValue("UpdateWaterMarkTemplateResponse.WaterMarkTemplate.State"));
		waterMarkTemplate.setDx(_ctx.stringValue("UpdateWaterMarkTemplateResponse.WaterMarkTemplate.Dx"));
		waterMarkTemplate.setWidth(_ctx.stringValue("UpdateWaterMarkTemplateResponse.WaterMarkTemplate.Width"));
		waterMarkTemplate.setHeight(_ctx.stringValue("UpdateWaterMarkTemplateResponse.WaterMarkTemplate.Height"));
		waterMarkTemplate.setName(_ctx.stringValue("UpdateWaterMarkTemplateResponse.WaterMarkTemplate.Name"));
		waterMarkTemplate.setDy(_ctx.stringValue("UpdateWaterMarkTemplateResponse.WaterMarkTemplate.Dy"));
		waterMarkTemplate.setId(_ctx.stringValue("UpdateWaterMarkTemplateResponse.WaterMarkTemplate.Id"));

		RatioRefer ratioRefer = new RatioRefer();
		ratioRefer.setDx(_ctx.stringValue("UpdateWaterMarkTemplateResponse.WaterMarkTemplate.RatioRefer.Dx"));
		ratioRefer.setWidth(_ctx.stringValue("UpdateWaterMarkTemplateResponse.WaterMarkTemplate.RatioRefer.Width"));
		ratioRefer.setHeight(_ctx.stringValue("UpdateWaterMarkTemplateResponse.WaterMarkTemplate.RatioRefer.Height"));
		ratioRefer.setDy(_ctx.stringValue("UpdateWaterMarkTemplateResponse.WaterMarkTemplate.RatioRefer.Dy"));
		waterMarkTemplate.setRatioRefer(ratioRefer);

		Timeline timeline = new Timeline();
		timeline.setStart(_ctx.stringValue("UpdateWaterMarkTemplateResponse.WaterMarkTemplate.Timeline.Start"));
		timeline.setDuration(_ctx.stringValue("UpdateWaterMarkTemplateResponse.WaterMarkTemplate.Timeline.Duration"));
		waterMarkTemplate.setTimeline(timeline);
		updateWaterMarkTemplateResponse.setWaterMarkTemplate(waterMarkTemplate);
	 
	 	return updateWaterMarkTemplateResponse;
	}
}