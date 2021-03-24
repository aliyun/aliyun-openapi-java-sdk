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

package com.aliyuncs.mse.transform.v20190531;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.mse.model.v20190531.ImportNacosConfigResponse;
import com.aliyuncs.mse.model.v20190531.ImportNacosConfigResponse.Data;
import com.aliyuncs.mse.model.v20190531.ImportNacosConfigResponse.Data.FailDataItem;
import com.aliyuncs.mse.model.v20190531.ImportNacosConfigResponse.Data.SkipDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ImportNacosConfigResponseUnmarshaller {

	public static ImportNacosConfigResponse unmarshall(ImportNacosConfigResponse importNacosConfigResponse, UnmarshallerContext _ctx) {
		
		importNacosConfigResponse.setRequestId(_ctx.stringValue("ImportNacosConfigResponse.RequestId"));
		importNacosConfigResponse.setSuccess(_ctx.booleanValue("ImportNacosConfigResponse.Success"));
		importNacosConfigResponse.setMessage(_ctx.stringValue("ImportNacosConfigResponse.Message"));
		importNacosConfigResponse.setErrorCode(_ctx.stringValue("ImportNacosConfigResponse.ErrorCode"));
		importNacosConfigResponse.setHttpStatusCode(_ctx.integerValue("ImportNacosConfigResponse.HttpStatusCode"));
		importNacosConfigResponse.setCode(_ctx.integerValue("ImportNacosConfigResponse.Code"));
		importNacosConfigResponse.setDynamicMessage(_ctx.stringValue("ImportNacosConfigResponse.DynamicMessage"));

		Data data = new Data();
		data.setSuccCount(_ctx.integerValue("ImportNacosConfigResponse.Data.SuccCount"));
		data.setSkipCount(_ctx.integerValue("ImportNacosConfigResponse.Data.SkipCount"));

		List<SkipDataItem> skipData = new ArrayList<SkipDataItem>();
		for (int i = 0; i < _ctx.lengthValue("ImportNacosConfigResponse.Data.SkipData.Length"); i++) {
			SkipDataItem skipDataItem = new SkipDataItem();
			skipDataItem.setDataId(_ctx.stringValue("ImportNacosConfigResponse.Data.SkipData["+ i +"].DataId"));
			skipDataItem.setGroup(_ctx.stringValue("ImportNacosConfigResponse.Data.SkipData["+ i +"].Group"));

			skipData.add(skipDataItem);
		}
		data.setSkipData(skipData);

		List<FailDataItem> failData = new ArrayList<FailDataItem>();
		for (int i = 0; i < _ctx.lengthValue("ImportNacosConfigResponse.Data.FailData.Length"); i++) {
			FailDataItem failDataItem = new FailDataItem();
			failDataItem.setDataId(_ctx.stringValue("ImportNacosConfigResponse.Data.FailData["+ i +"].DataId"));
			failDataItem.setGroup(_ctx.stringValue("ImportNacosConfigResponse.Data.FailData["+ i +"].Group"));

			failData.add(failDataItem);
		}
		data.setFailData(failData);
		importNacosConfigResponse.setData(data);
	 
	 	return importNacosConfigResponse;
	}
}