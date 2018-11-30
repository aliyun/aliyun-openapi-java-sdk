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

package com.aliyuncs.vod.model.v20170321;

import java.util.List;
import java.util.Map;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.vod.transform.v20170321.DescribePlayUserTotalResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribePlayUserTotalResponse extends AcsResponse {

	private String requestId;

	private List<UserPlayStatisTotal> userPlayStatisTotals;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public List<UserPlayStatisTotal> getUserPlayStatisTotals() {
		return this.userPlayStatisTotals;
	}

	public void setUserPlayStatisTotals(List<UserPlayStatisTotal> userPlayStatisTotals) {
		this.userPlayStatisTotals = userPlayStatisTotals;
	}

	public static class UserPlayStatisTotal {

		private String date;

		private String playDuration;

		private String playRange;

		private VV vV;

		private UV uV;

		public String getDate() {
			return this.date;
		}

		public void setDate(String date) {
			this.date = date;
		}

		public String getPlayDuration() {
			return this.playDuration;
		}

		public void setPlayDuration(String playDuration) {
			this.playDuration = playDuration;
		}

		public String getPlayRange() {
			return this.playRange;
		}

		public void setPlayRange(String playRange) {
			this.playRange = playRange;
		}

		public VV getVV() {
			return this.vV;
		}

		public void setVV(VV vV) {
			this.vV = vV;
		}

		public UV getUV() {
			return this.uV;
		}

		public void setUV(UV uV) {
			this.uV = uV;
		}

		public static class VV {

			private String android;

			private String iOS;

			private String flash;

			private String hTML5;

			public String getAndroid() {
				return this.android;
			}

			public void setAndroid(String android) {
				this.android = android;
			}

			public String getIOS() {
				return this.iOS;
			}

			public void setIOS(String iOS) {
				this.iOS = iOS;
			}

			public String getFlash() {
				return this.flash;
			}

			public void setFlash(String flash) {
				this.flash = flash;
			}

			public String getHTML5() {
				return this.hTML5;
			}

			public void setHTML5(String hTML5) {
				this.hTML5 = hTML5;
			}
		}

		public static class UV {

			private String android;

			private String iOS;

			private String flash;

			private String hTML5;

			public String getAndroid() {
				return this.android;
			}

			public void setAndroid(String android) {
				this.android = android;
			}

			public String getIOS() {
				return this.iOS;
			}

			public void setIOS(String iOS) {
				this.iOS = iOS;
			}

			public String getFlash() {
				return this.flash;
			}

			public void setFlash(String flash) {
				this.flash = flash;
			}

			public String getHTML5() {
				return this.hTML5;
			}

			public void setHTML5(String hTML5) {
				this.hTML5 = hTML5;
			}
		}
	}

	@Override
	public DescribePlayUserTotalResponse getInstance(UnmarshallerContext context) {
		return	DescribePlayUserTotalResponseUnmarshaller.unmarshall(this, context);
	}
}
