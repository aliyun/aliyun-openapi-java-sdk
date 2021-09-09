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

package com.aliyuncs.companyreg.transform.v20201022;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.companyreg.model.v20201022.GetVoucherCountResponse;
import com.aliyuncs.companyreg.model.v20201022.GetVoucherCountResponse.DataItem;
import com.aliyuncs.transform.UnmarshallerContext;


public class GetVoucherCountResponseUnmarshaller {

	public static GetVoucherCountResponse unmarshall(GetVoucherCountResponse getVoucherCountResponse, UnmarshallerContext _ctx) {
		
		getVoucherCountResponse.setRequestId(_ctx.stringValue("GetVoucherCountResponse.RequestId"));

		List<DataItem> data = new ArrayList<DataItem>();
		for (int i = 0; i < _ctx.lengthValue("GetVoucherCountResponse.Data.Length"); i++) {
			DataItem dataItem = new DataItem();
			dataItem.setPeriod(_ctx.stringValue("GetVoucherCountResponse.Data["+ i +"].Period"));
			dataItem.setCount(_ctx.integerValue("GetVoucherCountResponse.Data["+ i +"].Count"));

			data.add(dataItem);
		}
		getVoucherCountResponse.setData(data);
	 
	 	return getVoucherCountResponse;
	}
}