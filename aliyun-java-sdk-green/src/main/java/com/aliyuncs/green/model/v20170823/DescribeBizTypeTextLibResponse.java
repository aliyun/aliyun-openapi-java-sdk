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

		private List<Item> selected;

		private List<Item> all;

		public List<Item> getSelected() {
			return this.selected;
		}

		public void setSelected(List<Item> selected) {
			this.selected = selected;
		}

		public List<Item> getAll() {
			return this.all;
		}

		public void setAll(List<Item> all) {
			this.all = all;
		}

		public static class Item {

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

		private List<Item3> selected1;

		private List<Item3> all2;

		public List<Item3> getSelected1() {
			return this.selected1;
		}

		public void setSelected1(List<Item3> selected1) {
			this.selected1 = selected1;
		}

		public List<Item3> getAll2() {
			return this.all2;
		}

		public void setAll2(List<Item3> all2) {
			this.all2 = all2;
		}

		public static class Item3 {

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

		private List<Item6> selected4;

		private List<Item6> all5;

		public List<Item6> getSelected4() {
			return this.selected4;
		}

		public void setSelected4(List<Item6> selected4) {
			this.selected4 = selected4;
		}

		public List<Item6> getAll5() {
			return this.all5;
		}

		public void setAll5(List<Item6> all5) {
			this.all5 = all5;
		}

		public static class Item6 {

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

		private List<Item9> selected7;

		private List<Item9> all8;

		public List<Item9> getSelected7() {
			return this.selected7;
		}

		public void setSelected7(List<Item9> selected7) {
			this.selected7 = selected7;
		}

		public List<Item9> getAll8() {
			return this.all8;
		}

		public void setAll8(List<Item9> all8) {
			this.all8 = all8;
		}

		public static class Item9 {

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
