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

package com.aliyuncs.trademark.transform.v20180724;

import java.util.ArrayList;
import java.util.List;

import com.aliyuncs.trademark.model.v20180724.CheckLoaFillResponse;
import com.aliyuncs.trademark.model.v20180724.CheckLoaFillResponse.Data;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckLoaFillResponseUnmarshaller {

	public static CheckLoaFillResponse unmarshall(CheckLoaFillResponse checkLoaFillResponse, UnmarshallerContext _ctx) {
		
		checkLoaFillResponse.setRequestId(_ctx.stringValue("CheckLoaFillResponse.RequestId"));

		Data data = new Data();
		data.setStampFill(_ctx.booleanValue("CheckLoaFillResponse.Data.StampFill"));
		data.setAddressFill(_ctx.booleanValue("CheckLoaFillResponse.Data.AddressFill"));
		data.setTradeMarkNameFill(_ctx.booleanValue("CheckLoaFillResponse.Data.TradeMarkNameFill"));
		data.setCountryFill(_ctx.booleanValue("CheckLoaFillResponse.Data.CountryFill"));
		data.setNationalityFill(_ctx.booleanValue("CheckLoaFillResponse.Data.NationalityFill"));
		data.setMaterialNameFill(_ctx.booleanValue("CheckLoaFillResponse.Data.MaterialNameFill"));
		data.setTemplateUrl(_ctx.stringValue("CheckLoaFillResponse.Data.TemplateUrl"));

		List<String> errorMsgs = new ArrayList<String>();
		for (int i = 0; i < _ctx.lengthValue("CheckLoaFillResponse.Data.ErrorMsgs.Length"); i++) {
			errorMsgs.add(_ctx.stringValue("CheckLoaFillResponse.Data.ErrorMsgs["+ i +"]"));
		}
		data.setErrorMsgs(errorMsgs);
		checkLoaFillResponse.setData(data);
	 
	 	return checkLoaFillResponse;
	}
}