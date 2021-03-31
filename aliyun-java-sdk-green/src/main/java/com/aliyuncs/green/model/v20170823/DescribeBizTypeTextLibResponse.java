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

package com.aliyuncs.green.model.v20170823;

import java.util.List;
import com.aliyuncs.AcsResponse;
import com.aliyuncs.green.transform.v20170823.DescribeBizTypeTextLibResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeBizTypeTextLibResponse extends AcsResponse {

	private String requestId;

	private Black black;

	private Review review;

	private Ignore ignore;

	private White white;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public Black getBlack() {
		return this.black;
	}

	public void setBlack(Black black) {
		this.black = black;
	}

	public Review getReview() {
		return this.review;
	}

	public void setReview(Review review) {
		this.review = review;
	}

	public Ignore getIgnore() {
		return this.ignore;
	}

	public void setIgnore(Ignore ignore) {
		this.ignore = ignore;
	}

	public White getWhite() {
		return this.white;
	}

	public void setWhite(White white) {
		this.white = white;
	}

	public static class Black {

		private List<WhiteSelectedItem> selected;

		private List<WhiteAllItem> all;

		public List<WhiteSelectedItem> getSelected() {
			return this.selected;
		}

		public void setSelected(List<WhiteSelectedItem> selected) {
			this.selected = selected;
		}

		public List<WhiteAllItem> getAll() {
			return this.all;
		}

		public void setAll(List<WhiteAllItem> all) {
			this.all = all;
		}

		public static class WhiteSelectedItem {

			private String name;

			private String code;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}
		}

		public static class WhiteAllItem {

			private String name;

			private String code;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}
		}
	}

	public static class Review {

		private List<WhiteSelectedItem3> selected1;

		private List<WhiteAllItem4> all2;

		public List<WhiteSelectedItem3> getSelected1() {
			return this.selected1;
		}

		public void setSelected1(List<WhiteSelectedItem3> selected1) {
			this.selected1 = selected1;
		}

		public List<WhiteAllItem4> getAll2() {
			return this.all2;
		}

		public void setAll2(List<WhiteAllItem4> all2) {
			this.all2 = all2;
		}

		public static class WhiteSelectedItem3 {

			private String name;

			private String code;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}
		}

		public static class WhiteAllItem4 {

			private String name;

			private String code;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}
		}
	}

	public static class Ignore {

		private List<WhiteSelectedItem7> selected5;

		private List<WhiteAllItem8> all6;

		public List<WhiteSelectedItem7> getSelected5() {
			return this.selected5;
		}

		public void setSelected5(List<WhiteSelectedItem7> selected5) {
			this.selected5 = selected5;
		}

		public List<WhiteAllItem8> getAll6() {
			return this.all6;
		}

		public void setAll6(List<WhiteAllItem8> all6) {
			this.all6 = all6;
		}

		public static class WhiteSelectedItem7 {

			private String name;

			private String code;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}
		}

		public static class WhiteAllItem8 {

			private String name;

			private String code;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}
		}
	}

	public static class White {

		private List<WhiteSelectedItem11> selected9;

		private List<WhiteAllItem12> all10;

		public List<WhiteSelectedItem11> getSelected9() {
			return this.selected9;
		}

		public void setSelected9(List<WhiteSelectedItem11> selected9) {
			this.selected9 = selected9;
		}

		public List<WhiteAllItem12> getAll10() {
			return this.all10;
		}

		public void setAll10(List<WhiteAllItem12> all10) {
			this.all10 = all10;
		}

		public static class WhiteSelectedItem11 {

			private String name;

			private String code;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}
		}

		public static class WhiteAllItem12 {

			private String name;

			private String code;

			public String getName() {
				return this.name;
			}

			public void setName(String name) {
				this.name = name;
			}

			public String getCode() {
				return this.code;
			}

			public void setCode(String code) {
				this.code = code;
			}
		}
	}

	@Override
	public DescribeBizTypeTextLibResponse getInstance(UnmarshallerContext context) {
		return	DescribeBizTypeTextLibResponseUnmarshaller.unmarshall(this, context);
	}

	@Override
	public boolean checkShowJsonItemName() {
		return false;
	}
}
