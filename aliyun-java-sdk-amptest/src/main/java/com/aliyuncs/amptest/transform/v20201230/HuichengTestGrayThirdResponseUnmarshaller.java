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

package com.aliyuncs.amptest.transform.v20201230;

import com.aliyuncs.amptest.model.v20201230.HuichengTestGrayThirdResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class HuichengTestGrayThirdResponseUnmarshaller {

	public static HuichengTestGrayThirdResponse unmarshall(HuichengTestGrayThirdResponse huichengTestGrayThirdResponse, UnmarshallerContext _ctx) {
		
		huichengTestGrayThirdResponse.setRequestId(_ctx.stringValue("HuichengTestGrayThirdResponse.RequestId"));
		huichengTestGrayThirdResponse.setSize(_ctx.integerValue("HuichengTestGrayThirdResponse.Size"));
		huichengTestGrayThirdResponse.setValue(_ctx.stringValue("HuichengTestGrayThirdResponse.Value"));
	 
	 	return huichengTestGrayThirdResponse;
	}
}