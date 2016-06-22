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

import com.aliyuncs.mts.model.v20140618.UpdateWaterMarkTemplateResponse;
import com.aliyuncs.mts.model.v20140618.UpdateWaterMarkTemplateResponse.WaterMarkTemplate;
import com.aliyuncs.transform.UnmarshallerContext;


public class UpdateWaterMarkTemplateResponseUnmarshaller {

	public static UpdateWaterMarkTemplateResponse unmarshall(UpdateWaterMarkTemplateResponse updateWaterMarkTemplateResponse, UnmarshallerContext context) {
		
		updateWaterMarkTemplateResponse.setRequestId(context.stringValue("UpdateWaterMarkTemplateResponse.RequestId"));

		WaterMarkTemplate waterMarkTemplate = new WaterMarkTemplate();
		waterMarkTemplate.setId(context.stringValue("UpdateWaterMarkTemplateResponse.WaterMarkTemplate.Id"));
		waterMarkTemplate.setName(context.stringValue("UpdateWaterMarkTemplateResponse.WaterMarkTemplate.Name"));
		waterMarkTemplate.setWidth(context.stringValue("UpdateWaterMarkTemplateResponse.WaterMarkTemplate.Width"));
		waterMarkTemplate.setHeight(context.stringValue("UpdateWaterMarkTemplateResponse.WaterMarkTemplate.Height"));
		waterMarkTemplate.setDx(context.stringValue("UpdateWaterMarkTemplateResponse.WaterMarkTemplate.Dx"));
		waterMarkTemplate.setDy(context.stringValue("UpdateWaterMarkTemplateResponse.WaterMarkTemplate.Dy"));
		waterMarkTemplate.setReferPos(context.stringValue("UpdateWaterMarkTemplateResponse.WaterMarkTemplate.ReferPos"));
		waterMarkTemplate.setType(context.stringValue("UpdateWaterMarkTemplateResponse.WaterMarkTemplate.Type"));
		waterMarkTemplate.setState(context.stringValue("UpdateWaterMarkTemplateResponse.WaterMarkTemplate.State"));
		updateWaterMarkTemplateResponse.setWaterMarkTemplate(waterMarkTemplate);
	 
	 	return updateWaterMarkTemplateResponse;
	}
}