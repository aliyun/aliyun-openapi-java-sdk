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

package com.aliyuncs.ciomarketpop.model.v20250709;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.ciomarketpop.transform.v20250709.GetEveryOneSellsFormListResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class GetEveryOneSellsFormListResponse extends AcsResponse {

	@Override
	public GetEveryOneSellsFormListResponse getInstance(UnmarshallerContext context) {
		return	GetEveryOneSellsFormListResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
