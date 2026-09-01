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

package com.aliyuncs.quickbi_public.transform.v20220101;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.quickbi_public.model.v20220101.DataSetBloodResponse;
import com.aliyuncs.quickbi_public.model.v20220101.DataSetBloodResponse.WorksModels;
import com.aliyuncs.transform.UnmarshallerContext;


public class DataSetBloodResponseUnmarshaller {

	public static DataSetBloodResponse unmarshall(DataSetBloodResponse dataSetBloodResponse, UnmarshallerContext _ctx) {
		
		dataSetBloodResponse.setRequestId(_ctx.stringValue("DataSetBloodResponse.RequestId"));
		dataSetBloodResponse.setSuccess(_ctx.booleanValue("DataSetBloodResponse.Success"));

		List<WorksModels> result = new ArrayList<WorksModels>();
		for (int i = 0; i < _ctx.lengthValue("DataSetBloodResponse.Result.Length"); i++) {
			WorksModels worksModels = new WorksModels();
			worksModels.setWorksType(_ctx.stringValue("DataSetBloodResponse.Result["+ i +"].WorksType"));
			worksModels.setWorksId(_ctx.stringValue("DataSetBloodResponse.Result["+ i +"].WorksId"));

			result.add(worksModels);
		}
		dataSetBloodResponse.setResult(result);
	 
	 	return dataSetBloodResponse;
	}
}