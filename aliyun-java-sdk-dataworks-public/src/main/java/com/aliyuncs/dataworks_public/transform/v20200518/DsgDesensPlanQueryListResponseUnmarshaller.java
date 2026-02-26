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

package com.aliyuncs.dataworks_public.transform.v20200518;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.dataworks_public.model.v20200518.DsgDesensPlanQueryListResponse;
import com.aliyuncs.dataworks_public.model.v20200518.DsgDesensPlanQueryListResponse.PageData;
import com.aliyuncs.dataworks_public.model.v20200518.DsgDesensPlanQueryListResponse.PageData.Datas;
import com.aliyuncs.dataworks_public.model.v20200518.DsgDesensPlanQueryListResponse.PageData.Datas.DesensPlan;
import java.util.Map;
import com.aliyuncs.transform.UnmarshallerContext;


public class DsgDesensPlanQueryListResponseUnmarshaller {

	public static DsgDesensPlanQueryListResponse unmarshall(DsgDesensPlanQueryListResponse dsgDesensPlanQueryListResponse, UnmarshallerContext _ctx) {
		
		dsgDesensPlanQueryListResponse.setRequestId(_ctx.stringValue("DsgDesensPlanQueryListResponse.RequestId"));
		dsgDesensPlanQueryListResponse.setSuccess(_ctx.booleanValue("DsgDesensPlanQueryListResponse.Success"));
		dsgDesensPlanQueryListResponse.setErrorCode(_ctx.stringValue("DsgDesensPlanQueryListResponse.ErrorCode"));
		dsgDesensPlanQueryListResponse.setErrorMessage(_ctx.stringValue("DsgDesensPlanQueryListResponse.ErrorMessage"));
		dsgDesensPlanQueryListResponse.setHttpStatusCode(_ctx.integerValue("DsgDesensPlanQueryListResponse.HttpStatusCode"));

		PageData pageData = new PageData();
		pageData.setPageNumber(_ctx.integerValue("DsgDesensPlanQueryListResponse.PageData.PageNumber"));
		pageData.setPageSize(_ctx.integerValue("DsgDesensPlanQueryListResponse.PageData.PageSize"));
		pageData.setTotalCount(_ctx.integerValue("DsgDesensPlanQueryListResponse.PageData.TotalCount"));

		List<Datas> data = new ArrayList<Datas>();
		for (int i = 0; i < _ctx.lengthValue("DsgDesensPlanQueryListResponse.PageData.Data.Length"); i++) {
			Datas datas = new Datas();
			datas.setId(_ctx.longValue("DsgDesensPlanQueryListResponse.PageData.Data["+ i +"].Id"));
			datas.setDataType(_ctx.stringValue("DsgDesensPlanQueryListResponse.PageData.Data["+ i +"].DataType"));
			datas.setRuleName(_ctx.stringValue("DsgDesensPlanQueryListResponse.PageData.Data["+ i +"].RuleName"));
			datas.setOwner(_ctx.stringValue("DsgDesensPlanQueryListResponse.PageData.Data["+ i +"].Owner"));
			datas.setGmtCreate(_ctx.stringValue("DsgDesensPlanQueryListResponse.PageData.Data["+ i +"].GmtCreate"));
			datas.setGmtModified(_ctx.stringValue("DsgDesensPlanQueryListResponse.PageData.Data["+ i +"].GmtModified"));
			datas.setStatus(_ctx.integerValue("DsgDesensPlanQueryListResponse.PageData.Data["+ i +"].Status"));
			datas.setDesensWay(_ctx.stringValue("DsgDesensPlanQueryListResponse.PageData.Data["+ i +"].DesensWay"));
			datas.setDesenMode(_ctx.stringValue("DsgDesensPlanQueryListResponse.PageData.Data["+ i +"].DesenMode"));
			datas.setDesensRule(_ctx.stringValue("DsgDesensPlanQueryListResponse.PageData.Data["+ i +"].DesensRule"));
			datas.setSceneCode(_ctx.stringValue("DsgDesensPlanQueryListResponse.PageData.Data["+ i +"].SceneCode"));
			datas.setCheckWatermark(_ctx.booleanValue("DsgDesensPlanQueryListResponse.PageData.Data["+ i +"].CheckWatermark"));
			datas.setSceneName(_ctx.stringValue("DsgDesensPlanQueryListResponse.PageData.Data["+ i +"].SceneName"));

			DesensPlan desensPlan = new DesensPlan();
			desensPlan.setDesensPlanType(_ctx.stringValue("DsgDesensPlanQueryListResponse.PageData.Data["+ i +"].DesensPlan.DesensPlanType"));
			desensPlan.setExtParam(_ctx.mapValue("DsgDesensPlanQueryListResponse.PageData.Data["+ i +"].DesensPlan.ExtParam"));
			datas.setDesensPlan(desensPlan);

			data.add(datas);
		}
		pageData.setData(data);
		dsgDesensPlanQueryListResponse.setPageData(pageData);
	 
	 	return dsgDesensPlanQueryListResponse;
	}
}