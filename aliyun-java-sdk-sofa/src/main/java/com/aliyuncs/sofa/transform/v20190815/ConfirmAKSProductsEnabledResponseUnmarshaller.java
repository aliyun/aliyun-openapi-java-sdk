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

package com.aliyuncs.sofa.transform.v20190815;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.sofa.model.v20190815.ConfirmAKSProductsEnabledResponse;
import com.aliyuncs.sofa.model.v20190815.ConfirmAKSProductsEnabledResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class ConfirmAKSProductsEnabledResponseUnmarshaller {

	public static ConfirmAKSProductsEnabledResponse unmarshall(ConfirmAKSProductsEnabledResponse confirmAKSProductsEnabledResponse, UnmarshallerContext _ctx) {
		
		confirmAKSProductsEnabledResponse.setRequestId(_ctx.stringValue("ConfirmAKSProductsEnabledResponse.RequestId"));
		confirmAKSProductsEnabledResponse.setResultCode(_ctx.stringValue("ConfirmAKSProductsEnabledResponse.ResultCode"));
		confirmAKSProductsEnabledResponse.setResultMessage(_ctx.stringValue("ConfirmAKSProductsEnabledResponse.ResultMessage"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("ConfirmAKSProductsEnabledResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setEnabled(_ctx.booleanValue("ConfirmAKSProductsEnabledResponse.Data["+ i +"].Enabled"));
			dataItem.setProduct(_ctx.stringValue("ConfirmAKSProductsEnabledResponse.Data["+ i +"].Product"));

			data.add(dataItem);
		}
		confirmAKSProductsEnabledResponse.setData(data);
	 
	 	return confirmAKSProductsEnabledResponse;
	}
}