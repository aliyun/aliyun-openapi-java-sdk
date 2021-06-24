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

package com.aliyuncs.ecsops.transform.v20160401;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.ecsops.model.v20160401.OpsPdsaRecommendSolutionResponse;
import com.aliyuncs.ecsops.model.v20160401.OpsPdsaRecommendSolutionResponse.PdsaSubSolutionResult;
import com.aliyuncs.transform.UnmarshallerContext;


public class OpsPdsaRecommendSolutionResponseUnmarshaller {

	public static OpsPdsaRecommendSolutionResponse unmarshall(OpsPdsaRecommendSolutionResponse opsPdsaRecommendSolutionResponse, UnmarshallerContext _ctx) {
		
		opsPdsaRecommendSolutionResponse.setRequestId(_ctx.stringValue("OpsPdsaRecommendSolutionResponse.RequestId"));

		List<PdsaSubSolutionResult> pdsaSubSolutionResults = new ArrayList<PdsaSubSolutionResult>();
		for (int i = 0; i < _ctx.lengthValue("OpsPdsaRecommendSolutionResponse.PdsaSubSolutionResults.Length"); i++) {
			PdsaSubSolutionResult pdsaSubSolutionResult = new PdsaSubSolutionResult();
			pdsaSubSolutionResult.setNetWorkParam(_ctx.stringValue("OpsPdsaRecommendSolutionResponse.PdsaSubSolutionResults["+ i +"].NetWorkParam"));
			pdsaSubSolutionResult.setEndDate(_ctx.stringValue("OpsPdsaRecommendSolutionResponse.PdsaSubSolutionResults["+ i +"].EndDate"));
			pdsaSubSolutionResult.setSolutionType(_ctx.stringValue("OpsPdsaRecommendSolutionResponse.PdsaSubSolutionResults["+ i +"].SolutionType"));
			pdsaSubSolutionResult.setRegionNo(_ctx.stringValue("OpsPdsaRecommendSolutionResponse.PdsaSubSolutionResults["+ i +"].RegionNo"));
			pdsaSubSolutionResult.setBeginDate(_ctx.stringValue("OpsPdsaRecommendSolutionResponse.PdsaSubSolutionResults["+ i +"].BeginDate"));
			pdsaSubSolutionResult.setCpuModel(_ctx.stringValue("OpsPdsaRecommendSolutionResponse.PdsaSubSolutionResults["+ i +"].CpuModel"));
			pdsaSubSolutionResult.setLinuxPrice(_ctx.floatValue("OpsPdsaRecommendSolutionResponse.PdsaSubSolutionResults["+ i +"].LinuxPrice"));
			pdsaSubSolutionResult.setIops(_ctx.stringValue("OpsPdsaRecommendSolutionResponse.PdsaSubSolutionResults["+ i +"].Iops"));
			pdsaSubSolutionResult.setInstanceType(_ctx.stringValue("OpsPdsaRecommendSolutionResponse.PdsaSubSolutionResults["+ i +"].InstanceType"));
			pdsaSubSolutionResult.setWindowsPrice(_ctx.floatValue("OpsPdsaRecommendSolutionResponse.PdsaSubSolutionResults["+ i +"].WindowsPrice"));
			pdsaSubSolutionResult.setMem(_ctx.longValue("OpsPdsaRecommendSolutionResponse.PdsaSubSolutionResults["+ i +"].Mem"));
			pdsaSubSolutionResult.setAmount(_ctx.longValue("OpsPdsaRecommendSolutionResponse.PdsaSubSolutionResults["+ i +"].Amount"));
			pdsaSubSolutionResult.setInventoryType(_ctx.integerValue("OpsPdsaRecommendSolutionResponse.PdsaSubSolutionResults["+ i +"].InventoryType"));
			pdsaSubSolutionResult.setCpu(_ctx.longValue("OpsPdsaRecommendSolutionResponse.PdsaSubSolutionResults["+ i +"].Cpu"));
			pdsaSubSolutionResult.setPrice(_ctx.floatValue("OpsPdsaRecommendSolutionResponse.PdsaSubSolutionResults["+ i +"].Price"));
			pdsaSubSolutionResult.setZoneId(_ctx.stringValue("OpsPdsaRecommendSolutionResponse.PdsaSubSolutionResults["+ i +"].ZoneId"));
			pdsaSubSolutionResult.setInventoryAmount(_ctx.longValue("OpsPdsaRecommendSolutionResponse.PdsaSubSolutionResults["+ i +"].InventoryAmount"));

			pdsaSubSolutionResults.add(pdsaSubSolutionResult);
		}
		opsPdsaRecommendSolutionResponse.setPdsaSubSolutionResults(pdsaSubSolutionResults);
	 
	 	return opsPdsaRecommendSolutionResponse;
	}
}