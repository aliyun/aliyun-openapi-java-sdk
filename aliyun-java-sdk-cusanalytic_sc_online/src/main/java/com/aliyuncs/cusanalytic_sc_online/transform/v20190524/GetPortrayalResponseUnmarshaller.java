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

import com.aliyuncs.cusanalytic_sc_online.model.v20190524.GetPortrayalResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetPortrayalResponseUnmarshaller {

	public static GetPortrayalResponse unmarshall(GetPortrayalResponse getPortrayalResponse, UnmarshallerContext _ctx) {
		
		getPortrayalResponse.setFemalePercent(_ctx.floatValue("GetPortrayalResponse.FemalePercent"));
		getPortrayalResponse.setMcount(_ctx.longValue("GetPortrayalResponse.Mcount"));
		getPortrayalResponse.setMcount1120(_ctx.longValue("GetPortrayalResponse.Mcount1120"));
		getPortrayalResponse.setNewcount(_ctx.longValue("GetPortrayalResponse.Newcount"));
		getPortrayalResponse.setAgecount3140Percent(_ctx.floatValue("GetPortrayalResponse.Agecount3140Percent"));
		getPortrayalResponse.setAgecount4150Percent(_ctx.floatValue("GetPortrayalResponse.Agecount4150Percent"));
		getPortrayalResponse.setAgecount010Percent(_ctx.floatValue("GetPortrayalResponse.Agecount010Percent"));
		getPortrayalResponse.setFcount5160(_ctx.longValue("GetPortrayalResponse.Fcount5160"));
		getPortrayalResponse.setMcount010(_ctx.longValue("GetPortrayalResponse.Mcount010"));
		getPortrayalResponse.setMcountgt60(_ctx.longValue("GetPortrayalResponse.Mcountgt60"));
		getPortrayalResponse.setAgecount1120Percent(_ctx.floatValue("GetPortrayalResponse.Agecount1120Percent"));
		getPortrayalResponse.setFcountgt60(_ctx.longValue("GetPortrayalResponse.Fcountgt60"));
		getPortrayalResponse.setFcount4150(_ctx.longValue("GetPortrayalResponse.Fcount4150"));
		getPortrayalResponse.setOldcount(_ctx.longValue("GetPortrayalResponse.Oldcount"));
		getPortrayalResponse.setFcount3140(_ctx.longValue("GetPortrayalResponse.Fcount3140"));
		getPortrayalResponse.setFcount2130(_ctx.longValue("GetPortrayalResponse.Fcount2130"));
		getPortrayalResponse.setAgecountgt60Percent(_ctx.floatValue("GetPortrayalResponse.Agecountgt60Percent"));
		getPortrayalResponse.setFcount1120(_ctx.longValue("GetPortrayalResponse.Fcount1120"));
		getPortrayalResponse.setOldcountPercent(_ctx.floatValue("GetPortrayalResponse.OldcountPercent"));
		getPortrayalResponse.setMcount4150(_ctx.longValue("GetPortrayalResponse.Mcount4150"));
		getPortrayalResponse.setFcount(_ctx.longValue("GetPortrayalResponse.Fcount"));
		getPortrayalResponse.setNewcountPercent(_ctx.floatValue("GetPortrayalResponse.NewcountPercent"));
		getPortrayalResponse.setMcount2130(_ctx.longValue("GetPortrayalResponse.Mcount2130"));
		getPortrayalResponse.setMcount3140(_ctx.longValue("GetPortrayalResponse.Mcount3140"));
		getPortrayalResponse.setAgecount5160Percent(_ctx.floatValue("GetPortrayalResponse.Agecount5160Percent"));
		getPortrayalResponse.setAgecount2130Percent(_ctx.floatValue("GetPortrayalResponse.Agecount2130Percent"));
		getPortrayalResponse.setFcount010(_ctx.longValue("GetPortrayalResponse.Fcount010"));
		getPortrayalResponse.setMcount5160(_ctx.longValue("GetPortrayalResponse.Mcount5160"));
		getPortrayalResponse.setMalePercent(_ctx.floatValue("GetPortrayalResponse.MalePercent"));
	 
	 	return getPortrayalResponse;
	}
}