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

import com.aliyuncs.mse.model.v20190531.CloneNacosConfigResponse;
import com.aliyuncs.mse.model.v20190531.CloneNacosConfigResponse.Data;
import com.aliyuncs.mse.model.v20190531.CloneNacosConfigResponse.Data.FailDataItem;
import com.aliyuncs.mse.model.v20190531.CloneNacosConfigResponse.Data.SkipDataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class CloneNacosConfigResponseUnmarshaller {

	public static CloneNacosConfigResponse unmarshall(CloneNacosConfigResponse cloneNacosConfigResponse, UnmarshallerContext _ctx) {
		
		cloneNacosConfigResponse.setRequestId(_ctx.stringValue("CloneNacosConfigResponse.RequestId"));
		cloneNacosConfigResponse.setSuccess(_ctx.booleanValue("CloneNacosConfigResponse.Success"));
		cloneNacosConfigResponse.setMessage(_ctx.stringValue("CloneNacosConfigResponse.Message"));
		cloneNacosConfigResponse.setErrorCode(_ctx.stringValue("CloneNacosConfigResponse.ErrorCode"));
		cloneNacosConfigResponse.setHttpStatusCode(_ctx.integerValue("CloneNacosConfigResponse.HttpStatusCode"));
		cloneNacosConfigResponse.setCode(_ctx.integerValue("CloneNacosConfigResponse.Code"));
		cloneNacosConfigResponse.setDynamicMessage(_ctx.stringValue("CloneNacosConfigResponse.DynamicMessage"));

		Data data = new Data();
		data.setSuccCount(_ctx.integerValue("CloneNacosConfigResponse.Data.SuccCount"));
		data.setSkipCount(_ctx.integerValue("CloneNacosConfigResponse.Data.SkipCount"));

		List<SkipDataItem> skipData = new ArrayList<SkipDataItem>();
		for (int i = 0; i < _ctx.lengthValue("CloneNacosConfigResponse.Data.SkipData.Length"); i++) {
			SkipDataItem skipDataItem = new SkipDataItem();
			skipDataItem.setDataId(_ctx.stringValue("CloneNacosConfigResponse.Data.SkipData["+ i +"].DataId"));
			skipDataItem.setGroup(_ctx.stringValue("CloneNacosConfigResponse.Data.SkipData["+ i +"].Group"));

			skipData.add(skipDataItem);
		}
		data.setSkipData(skipData);

		List<FailDataItem> failData = new ArrayList<FailDataItem>();
		for (int i = 0; i < _ctx.lengthValue("CloneNacosConfigResponse.Data.FailData.Length"); i++) {
			FailDataItem failDataItem = new FailDataItem();
			failDataItem.setDataId(_ctx.stringValue("CloneNacosConfigResponse.Data.FailData["+ i +"].DataId"));
			failDataItem.setGroup(_ctx.stringValue("CloneNacosConfigResponse.Data.FailData["+ i +"].Group"));

			failData.add(failDataItem);
		}
		data.setFailData(failData);
		cloneNacosConfigResponse.setData(data);
	 
	 	return cloneNacosConfigResponse;
	}
}