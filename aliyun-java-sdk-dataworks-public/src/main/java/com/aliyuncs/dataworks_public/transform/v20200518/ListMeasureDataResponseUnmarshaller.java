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

import com.aliyuncs.dataworks_public.model.v20200518.ListMeasureDataResponse;
import com.aliyuncs.dataworks_public.model.v20200518.ListMeasureDataResponse.MeasureData;
import com.aliyuncs.transform.UnmarshallerContext;


public class ListMeasureDataResponseUnmarshaller {

	public static ListMeasureDataResponse unmarshall(ListMeasureDataResponse listMeasureDataResponse, UnmarshallerContext _ctx) {
		
		listMeasureDataResponse.setRequestId(_ctx.stringValue("ListMeasureDataResponse.RequestId"));
		listMeasureDataResponse.setSuccess(_ctx.booleanValue("ListMeasureDataResponse.Success"));
		listMeasureDataResponse.setErrorCode(_ctx.stringValue("ListMeasureDataResponse.ErrorCode"));
		listMeasureDataResponse.setErrorMessage(_ctx.stringValue("ListMeasureDataResponse.ErrorMessage"));
		listMeasureDataResponse.setHttpStatusCode(_ctx.integerValue("ListMeasureDataResponse.HttpStatusCode"));

		List<MeasureData> measureDatas = new ArrayList<MeasureData>();
		for (int i = 0; i < _ctx.lengthValue("ListMeasureDataResponse.MeasureDatas.Length"); i++) {
			MeasureData measureData = new MeasureData();
			measureData.setDomainCode(_ctx.stringValue("ListMeasureDataResponse.MeasureDatas["+ i +"].DomainCode"));
			measureData.setComponentCode(_ctx.stringValue("ListMeasureDataResponse.MeasureDatas["+ i +"].ComponentCode"));
			measureData.setStartTime(_ctx.longValue("ListMeasureDataResponse.MeasureDatas["+ i +"].StartTime"));
			measureData.setEndTime(_ctx.longValue("ListMeasureDataResponse.MeasureDatas["+ i +"].EndTime"));
			measureData.setUsage(_ctx.longValue("ListMeasureDataResponse.MeasureDatas["+ i +"].Usage"));

			measureDatas.add(measureData);
		}
		listMeasureDataResponse.setMeasureDatas(measureDatas);
	 
	 	return listMeasureDataResponse;
	}
}