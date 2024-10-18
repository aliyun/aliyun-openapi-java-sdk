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

package com.aliyuncs.domain.transform.v20180129;

import com.aliyuncs.domain.model.v20180129.CheckIntlFixPriceDomainStatusResponse;
import com.aliyuncs.domain.model.v20180129.CheckIntlFixPriceDomainStatusResponse.Module;
import com.aliyuncs.transform.UnmarshallerContext;


public class CheckIntlFixPriceDomainStatusResponseUnmarshaller {

	public static CheckIntlFixPriceDomainStatusResponse unmarshall(CheckIntlFixPriceDomainStatusResponse checkIntlFixPriceDomainStatusResponse, UnmarshallerContext _ctx) {
		
		checkIntlFixPriceDomainStatusResponse.setRequestId(_ctx.stringValue("CheckIntlFixPriceDomainStatusResponse.RequestId"));

		Module module = new Module();
		module.setDomain(_ctx.stringValue("CheckIntlFixPriceDomainStatusResponse.Module.Domain"));
		module.setPrice(_ctx.longValue("CheckIntlFixPriceDomainStatusResponse.Module.Price"));
		module.setCurrency(_ctx.stringValue("CheckIntlFixPriceDomainStatusResponse.Module.Currency"));
		module.setRegDate(_ctx.longValue("CheckIntlFixPriceDomainStatusResponse.Module.RegDate"));
		module.setDeadDate(_ctx.longValue("CheckIntlFixPriceDomainStatusResponse.Module.DeadDate"));
		module.setEndTime(_ctx.longValue("CheckIntlFixPriceDomainStatusResponse.Module.EndTime"));
		module.setPremium(_ctx.booleanValue("CheckIntlFixPriceDomainStatusResponse.Module.Premium"));
		checkIntlFixPriceDomainStatusResponse.setModule(module);
	 
	 	return checkIntlFixPriceDomainStatusResponse;
	}
}